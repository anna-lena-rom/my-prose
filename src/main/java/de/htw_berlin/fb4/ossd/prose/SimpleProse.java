package de.htw_berlin.fb4.ossd.prose;

public class SimpleProse implements Prose{
    @Override
    public String get() {
        return null;
    }

    public String getText(SimpleSentence[] sentences) {
        StringBuilder text = new StringBuilder();
        for (SimpleSentence sentence : sentences) {
            text.append(sentence.get()).append(" ");
        }
        return text.toString().trim();
    }
}