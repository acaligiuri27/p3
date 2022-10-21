package spellchecker;

import java.util.List;

public class SpellChecker {

    private List lexicon;

    public SpellChecker(java.util.List<java.lang.String> lexicon)
     //Constructor that takes a lexicon of words. This constructor must not modify the list.
    // Any duplicate words should be discarded, or to put it another way, the spell checker should keep only a single copy of each word.
    // BK Trees get constructed and made, its not abstract like the state space tree.
    {
        this.lexicon = lexicon;
    }

    public boolean spelledCorrectly(java.lang.String word)
    //Uses BK-Tree to check if word is spelled correctly. This method should ignore case (e.g., "cat" == "CAT").
    {
        return false;
    }

    public java.util.List<java.lang.String> suggestWords(java.lang.String word, int maxEditDistance)
    //Creates a list of potential correct spellings for the given misspelled word. The list of potential correct spellings is created by traversing the BK-Tree.
    // If the given word is spelled correctly, the suggestion list contains only that word. This method should ignore case (e.g., "cat" == "CAT").
    {
        return null;
    }

    public static int editDistance(java.lang.String s1, java.lang.String s2)
    //Calculates the Levenshtein distances between s1 and s2. This method should ignore case (e.g., 'a' == 'A').
    // For simplicity we are assuming each char of these strings represents a single letter.
    // That is we will assume that each character of these strings would pass the Character.isLetter(char) test.
    {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        return 0;
    }

    public static java.util.List<java.lang.String> suggestWordsTest(java.lang.String word, int maxEditDistance, java.util.List<java.lang.String> lexicon)
    //Creates a list of potential correct spellings for the given misspelled word. The list of potential correct spellings is taken from the lexicon list.
    // This method simply iterates over lexicon checking the edit distance between given word and the lexicon word.
    // If the given word is spelled correctly, the suggestion list contains only that word. Use this method to implement Milestone2.
    {
        return null;
    }
}
