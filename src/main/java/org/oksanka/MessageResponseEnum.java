package org.oksanka;

public enum MessageResponseEnum {
    WELCOME_MESSAGE("/start", """
            Привіт! Я твій власний mental_health_helper_bot!
            І ти можеш до мене звертатися, коли потрібна допомога 
            у будь - який час. Якшо ти віддчуваєш занепокоєння, тривогу, 
            незрозумілі відчуття в своєму душевному стані чи піддався/піддалася стресовій ситуації, 
            то звертайся. Я знайду найкращий спосіб тобі допомогти і заспокоїти!
                 
            Спробуємо дізнатися, що тебе турбує. Щоб розпочати натисни /begin"""),
    BEGIN_MESSAGE("/begin",
            "Про що ти хочеш дізнатися більше? Вибери, будь ласка, із переліченого:"),
    DEFAULT_MESSAGE(null, "Привіт! Натисни, будь ласка, /start, щоб розпочати спілкування.");
    private final String key;
    private final String message;

    MessageResponseEnum(String key, String message) {
        this.key = key;
        this.message = message;
    }

    public String getKey() {
        return key;
    }

    public String getMessage() {
        return message;
    }

}
