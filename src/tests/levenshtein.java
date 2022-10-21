package tests;

import org.junit.jupiter.api.Test;
import spellchecker.SpellChecker;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class levenshtein {

    public List<String> makeList()
    {
        List<String> lexicon = new ArrayList<>();
        return lexicon;
    }


    @Test
    public void editDistanceBasic()
    {
        List<String> lexicon = makeList();
        SpellChecker test1 = new SpellChecker(lexicon);

    }
}
