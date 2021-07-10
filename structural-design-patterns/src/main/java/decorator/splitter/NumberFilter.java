package decorator.splitter;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NumberFilter extends StringSplitterDecorator {

    public NumberFilter(StringSplitter splitter) {
        super(splitter);
    }

    @Override
    public List<String> splitString(String sentence) {
        List<String> splitSentence = super.splitString(sentence);
        Pattern p = Pattern.compile("[0-9]");
        return splitSentence.stream()
                .filter(e -> !p.matcher(e).find())
                .collect(Collectors.toList());
    }
}
