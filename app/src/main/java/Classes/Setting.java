package Classes;
enum Language{Arabic,English}
enum Theme{Dark,Light}
public class Setting {
    Language language;
    Theme theme;

    public Setting(Language language, Theme theme) {
        this.language = language;
        this.theme = theme;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
    public boolean shownotifications() {
        return true;
    }
}
