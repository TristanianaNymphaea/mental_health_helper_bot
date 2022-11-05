package org.oksanka.controller;

import org.oksanka.enums.ButtonResponseEnum;
import org.oksanka.enums.MessageResponseEnum;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class QuestionsPointsFactory {

    private Map<String, QuestionsPoint> questionsPointsMap;

    public QuestionsPointsFactory() {

    questionsPointsMap = buildQuestionsPoints();
    }

    public QuestionsPoint getQuestionsPoint(String key){

        return questionsPointsMap.get(key);
    }

    private Map<String, QuestionsPoint> buildQuestionsPoints() {
        var list = new ArrayList<QuestionsPoint>();

        list.add(
                new QuestionsPoint(MessageResponseEnum.WELCOME_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.DEFAULT_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.BEGIN_MESSAGE,
                        List.of(
                                buildButton("переживаєш стрес", "A1"),
                                buildButton("відчуття виснаження на роботі", "A2"),
                                buildButton("надмірна тривожність, занепокоєння", "A3"),
                                buildButton("пригнічений настрій", "A4")

                        )
                )
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.MANIFESTATION_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.PRACTICE_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.CONTINUE_PRACTICE_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.GOAL_PRACTICE_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.BURN_OUT_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.BURN_OUT_SYNDROME_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.ABOUT_BURN_OUT_SYNDROME_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.PREVENTION_BURN_OUT_SYNDROME_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.OVERCOMING_BURN_OUT_SYNDROME_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.ANXIETY_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.TESTING_ANXIETY_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.HELPING_ANXIETY_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.OTHER_HELPING_ANXIETY_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.MEDICINE_HELPING_ANXIETY_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.DEPRESSION_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.SPECIES_DEPRESSION_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.TESTING_DEPRESSION_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.RECOMMENDATION_DEPRESSION_MESSAGE, null)
        );
        list.add(
                new QuestionsPoint(MessageResponseEnum.PREVENTION_DEPRESSION_MESSAGE, null)
        );

        Arrays.stream(ButtonResponseEnum.values())
                .map(buttonResponseEnum -> new QuestionsPoint(buttonResponseEnum))
                .forEach(questionsPoint -> list.add(questionsPoint));


        return list.stream().collect(Collectors.toMap(
                QuestionsPoint::getActivationKey, Function.identity()));
    }

    private InlineKeyboardButton buildButton(String name, String key) {
        return InlineKeyboardButton.builder()
                .text(name)
                .callbackData(key)
                .build();
    }
}
