package linearsearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchWordTest {
    private static final String[] strings= {
        "The quick brown fox jumps",
                "Over the lazy dog sleeps now",
                "siddhu loves coding in Python",
                "Data science is always evolving",
                "Machine learning models require training"
    };

    @Test
    void searchSequenceWithWord() {
        String result = SearchWord.searchSequenceWithWord(strings, "dog");
        String expected = "Over the lazy dog sleeps now";
        assertEquals(expected,result);
    }
}