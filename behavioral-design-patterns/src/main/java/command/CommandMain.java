package command;

import command.commands.CopyCommand;
import command.commands.PasteCommand;
import command.text.TextEditor;

public class CommandMain {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("AAAbbbCCC");
        copyText(textEditor);
        pasteText(textEditor);
        System.out.println(textEditor);
    }

    public static void copyText(TextEditor textEditor) {
        CopyCommand command = new CopyCommand(textEditor);
        command.exec();
    }

    public static void pasteText(TextEditor textEditor) {
        PasteCommand command = new PasteCommand(textEditor);
        command.exec();
    }

}
