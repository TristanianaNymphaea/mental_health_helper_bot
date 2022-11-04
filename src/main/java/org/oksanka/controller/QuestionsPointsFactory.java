package org.oksanka.controller;

import org.oksanka.ButtonResponseEnum;
import org.oksanka.MessageResponseEnum;
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
                                buildButton("пригнічений настрій", "A4"),
                                buildButton("небажання жити", "A5"),
                                buildButton("незрозумілі відчуття, галюцинації", "A6")
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
