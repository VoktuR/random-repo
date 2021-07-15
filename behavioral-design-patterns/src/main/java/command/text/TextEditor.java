package command.text;

public class TextEditor {

    private String text;

    private String buf;

    public TextEditor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getBuf() {
        return buf;
    }

    public void setBuf(String buf) {
        this.buf = buf;
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "text='" + text + '\'' +
                ", buf='" + buf + '\'' +
                '}';
    }
}
