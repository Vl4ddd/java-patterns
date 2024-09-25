package socnet.socnet.Settings;

public class InterfaceSettings {
    private String language;
    private String theme;
    private String font;

    public InterfaceSettings(String language, String theme, String font) {
        this.language = language;
        this.theme = theme;
        this.font = font;
    }

    public InterfaceSettings clone() {
        return new InterfaceSettings(this.language, this.theme, this.font);
    }

}
