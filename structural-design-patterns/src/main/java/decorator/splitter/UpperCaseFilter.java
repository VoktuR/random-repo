package decorator.splitter;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class UpperCaseFilter extends StringSplitterDecorator {

    public UpperCaseFilter(StringSplitter splitter) {
        super(splitter);
    }

    @Override
    public List<String> splitString(String sentence) {
        List<String> splitSentence = super.splitString(sentence);
        Pattern p = Pattern.compile("[A-Z]");
        return splitSentence.stream()
                .filter(e -> !p.matcher(e).find())
                .collect(Collectors.toList());
    }
}
