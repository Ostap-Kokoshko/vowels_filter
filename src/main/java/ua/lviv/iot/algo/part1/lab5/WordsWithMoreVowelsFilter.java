package ua.lviv.iot.algo.part1.lab5;

import java.util.regex.Pattern;

public class WordsWithMoreVowelsFilter {
    private final Pattern pattern = Pattern.compile("[aeiouAEIOU]+");

    public String removeWordsWithMoreVowels(String sentence) {
        String[] wordsArray = sentence.split("\\s+");
        StringBuilder newSentence = new StringBuilder();

        for (String word : wordsArray) {
            String consonantsString = pattern.matcher(word).replaceAll("");

            if (consonantsString.length() >= (word.length() - consonantsString.length())) {
                newSentence.append(word).append(" ");

            }
        }

        return newSentence.toString();
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            String writtenText = args[0];
            WordsWithMoreVowelsFilter wordsWithMoreVowelsFilter = new WordsWithMoreVowelsFilter();
            String result = wordsWithMoreVowelsFilter.removeWordsWithMoreVowels(writtenText);
            System.out.println(result);
        } else {
            System.out.println("Please provide a sentence as a command line argument.");
        }
    }
}