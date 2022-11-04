package org.oksanka.controller;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public interface SendMessageSupplier {

    SendMessage buildSendMessage(Long chatId);
}
