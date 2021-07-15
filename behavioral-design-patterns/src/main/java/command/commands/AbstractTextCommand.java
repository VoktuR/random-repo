package command.commands;

import command.text.TextEditor;

public abstract class AbstractTextCommand {

    protected TextEditor textEditor;

    private String backup;

    public AbstractTextCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void backup() {
        backup = textEditor.getText();
    }

    public void rollback() {
        textEditor.setText(backup);
    }

    public abstract void exec();

}
