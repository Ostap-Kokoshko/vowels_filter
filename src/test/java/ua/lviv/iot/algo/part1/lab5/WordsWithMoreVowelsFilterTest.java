package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordsWithMoreVowelsFilterTest {
    WordsWithMoreVowelsFilter deleteWords;

    @BeforeEach
    void setUp() {
        deleteWords = new WordsWithMoreVowelsFilter();
    }

    @Test
    public void testRemoveWordsWithMoreVowels() {
        String sentence = "Hello my friend, I am soooo buuuusy today";
        Assertions.assertEquals("Hello my friend, am today ", deleteWords.removeWordsWithMoreVowels(sentence));
    }

    @Test
    public void testRemoveWordsWhenItNull() {
        String sentence = "";
        Assertions.assertEquals(" ", deleteWords.removeWordsWithMoreVowels(sentence));
    }

    @Test
    public void testRemoveWordsWhenItNothingToRemove() {
        String sentence = "Hello my friend, she is so busy today";
        Assertions.assertEquals("Hello my friend, she is so busy today ", deleteWords.removeWordsWithMoreVowels(sentence));
    }

    @Test
    public void testRemoveWordsWhenAllWordsRemoved() {
        String sentence = "aeiou AEIOU";
        Assertions.assertEquals("", deleteWords.removeWordsWithMoreVowels(sentence));
    }
}