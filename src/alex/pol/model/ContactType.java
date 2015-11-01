package alex.pol.model;

/**
 * Created by Alex on 20.10.2015.
 */
public enum ContactType {
    PHONE("Телефон"),
    MAIL("Мыло"),
    SKYPE("Скайп"),
    LINKEDIN("Профиль в LinkedIn"),
    FACEBOOK("Профиль в Facebook");
    private String name;

    ContactType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

