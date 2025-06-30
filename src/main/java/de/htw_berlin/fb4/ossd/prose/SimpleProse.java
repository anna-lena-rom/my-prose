package de.htw_berlin.fb4.ossd.prose;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SimpleProse implements Prose{
    private final SimpleSentence[] sentences;

    public SimpleProse(SimpleSentence[] sentences) {
        this.sentences = sentences;
    }

    @Override
    public String get() {
        return Arrays.stream(sentences)
                     .map(SimpleSentence::get)
                     .collect(Collectors.joining(" "));
    }
}