package command.commands;

import command.text.TextEditor;

public class CopyCommand extends AbstractTextCommand {

    public CopyCommand(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void exec() {
        textEditor.setBuf(textEditor.getText());
    }

}
