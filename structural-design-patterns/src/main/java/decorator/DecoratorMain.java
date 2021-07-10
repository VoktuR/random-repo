package decorator;

import decorator.splitter.*;

import java.util.List;

public class DecoratorMain {

    public static void main(String[] args) {

        String sentence = "tree, grass, mars4, ILANIX, a, d, Mihail, n";
        StringSplitter splitter = new LetterFilter(new NumberFilter(new UpperCaseFilter(new StringSplitterImpl())));
        List<String> result = splitter.splitString(sentence);
        System.out.println(result);

    }

}
