package decorator.splitter;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class LetterFilter extends StringSplitterDecorator {

    public LetterFilter(StringSplitter splitter) {
        super(splitter);
    }

    @Override
    public List<String> splitString(String sentence) {
        List<String> splitSentence = super.splitString(sentence);
        Pattern p = Pattern.compile("[a-d]");
        return splitSentence.stream()
                .filter(e -> p.matcher(e).matches())
                .collect(Collectors.toList());
    }
}
