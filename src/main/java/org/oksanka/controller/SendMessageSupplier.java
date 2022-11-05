package org.oksanka.controller;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface SendMessageSupplier {

    SendMessage buildSendMessage(Long chatId);
}
