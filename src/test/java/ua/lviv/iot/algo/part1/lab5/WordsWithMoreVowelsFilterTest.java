package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordsWithMoreVowelsFilterTest {
    private WordsWithMoreVowelsFilter deleteWords;

    @BeforeEach
    void setUp() {
        deleteWords = new WordsWithMoreVowelsFilter();
    }

    @Test
    public void testRemoveWordsWithMoreVowels() {
        String sentence = "Hello my friend, I am soooo buuuusy today";
        String result = "Hello my friend, am today ";
        Assertions.assertEquals(result, deleteWords.removeWordsWithMoreVowels(sentence));
    }

    @Test
    public void testRemoveWordsWhenSentenceIsEmpty() {
        String sentence = "";
        String result = " ";
        Assertions.assertEquals(result, deleteWords.removeWordsWithMoreVowels(sentence));
    }

    @Test
    public void testRemoveWordsWhenItNothingToRemove() {
        String sentence = "Hello my friend, she is so busy today";
        String result = "Hello my friend, she is so busy today ";
        Assertions.assertEquals(result, deleteWords.removeWordsWithMoreVowels(sentence));
    }

    @Test
    public void testRemoveWordsWhenAllWordsRemoved() {
        String sentence = "aeiou AEIOU";
        String result = "";
        Assertions.assertEquals(result, deleteWords.removeWordsWithMoreVowels(sentence));
    }
}