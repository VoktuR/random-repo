package decorator.splitter;

import java.util.List;

public class StringSplitterDecorator implements StringSplitter {

    protected StringSplitter splitter;

    public StringSplitterDecorator(StringSplitter splitter) {
        this.splitter = splitter;
    }

    @Override
    public List<String> splitString(String sentence) {
        return splitter.splitString(sentence);
    }
}
