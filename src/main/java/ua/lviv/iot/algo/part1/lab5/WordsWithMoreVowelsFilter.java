package ua.lviv.iot.algo.part1.lab5;

import java.util.regex.Pattern;

public class WordsWithMoreVowelsFilter {
    Pattern pattern = Pattern.compile("[aeiouAEIOU]+");

    public String removeWordsWithMoreVowels(String sentence) {
        String[] arrSentence = sentence.split("\\s+");
        StringBuilder newSentence = new StringBuilder();
        for (String string : arrSentence) {
            String consonantsString = pattern.matcher(string).replaceAll("");
            if (consonantsString.length() >= (string.length() - consonantsString.length())) {
                newSentence.append(string).append(" ");
            }
        }
        return newSentence.toString();
    }
}