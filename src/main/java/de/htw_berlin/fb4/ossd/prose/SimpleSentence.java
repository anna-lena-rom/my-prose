package de.htw_berlin.fb4.ossd.prose;

import java.util.ArrayList;
import java.util.List;

public class SimpleSentence implements Sentence {
    @Override
    public String get() {
        return null;
    }

    public List<String> getWords(String sentence) {
        List<String> list = new ArrayList<>();
        String[] array = sentence.split(" ");

        for (String word : array) {
            list.add(word);
        }

        return list;
    }
}