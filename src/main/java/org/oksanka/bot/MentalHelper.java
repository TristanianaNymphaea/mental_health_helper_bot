package org.oksanka.bot;

import org.oksanka.controller.QuestionsPointsFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Optional;

public class MentalHelper extends TelegramLongPollingBot {
    private final QuestionsPointsFactory questions;

    @Override
    public String getBotUsername() {
        return "mental_health_helper_bot";
    }

    @Override
    public String getBotToken() {
        return System.getenv("TG_KEY");
    }

    public MentalHelper() {
        questions = new QuestionsPointsFactory();
    }

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasCallbackQuery()) {
            System.out.println("Get some callback!");
            try {
                reactToButton(update);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
            return;
        }

        if (update.hasMessage()) {

            try {

                System.out.println("Get some update!");
                System.out.println(update);
                reactToMessage(update);


            } catch (TelegramApiException e) {
                System.out.println(e);
            }
            return;
        }

    }

    private void reactToMessage(Update update) throws TelegramApiException {
        String text = update.getMessage().getText();

        var questionPointMessage = Optional.ofNullable(text)
                .map(questions::getQuestionsPoint)
                .orElse(questions.getQuestionsPoint(null))
                .buildSendMessage(update.getMessage().getChatId());


        super.execute(questionPointMessage);
    }


    private void reactToButton(Update update) throws TelegramApiException {
        String text = update.getCallbackQuery().getData();

        System.out.println(text);
        var replyMessage = Optional.ofNullable(text)
                .map(questions::getQuestionsPoint)
                .orElseThrow();

        System.out.println(replyMessage.getMessage().length());
        try {
            var message = replyMessage.buildSendMessage(update.getCallbackQuery().getMessage().getChatId());
            message.setReplyToMessageId(update.getCallbackQuery().getMessage().getMessageId());
            super.execute(message);
        } catch (TelegramApiException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }

    }
}
