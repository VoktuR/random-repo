package decorator.splitter;

import java.util.Arrays;
import java.util.List;

public class StringSplitterImpl implements StringSplitter {

    @Override
    public List<String> splitString(String sentence) {
        return Arrays.asList(sentence.split(",\\s"));
    }

}
