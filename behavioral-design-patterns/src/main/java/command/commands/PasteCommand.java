package command.commands;

import command.text.TextEditor;

public class PasteCommand extends AbstractTextCommand {

    public PasteCommand(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void exec() {
        this.backup();
        String tempTxt = textEditor.getText();
        tempTxt = tempTxt.concat(textEditor.getBuf());
        textEditor.setText(tempTxt);
    }

}
