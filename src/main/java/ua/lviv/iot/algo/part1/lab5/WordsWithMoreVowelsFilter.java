package ua.lviv.iot.algo.part1.lab5;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        WordsWithMoreVowelsFilter remover = new WordsWithMoreVowelsFilter();
        String modifiedSentence = remover.removeWordsWithMoreVowels(sentence);
        System.out.println("Modified sentence: " + modifiedSentence);
        scanner.close();
    }
}