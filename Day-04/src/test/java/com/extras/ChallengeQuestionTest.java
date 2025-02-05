package com.extras;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class ChallengeQuestionTest {
    static int count = 1;
    private static final String TEST_FILE_PATH = "/Users/siddhu/Desktop/cg-tut/Week3/Day-04/src/main/resources/test_file.txt";
    private static String[] testStrings;

    @BeforeAll
    static void setup() throws IOException {
        testStrings = new String[1000];
        for (int i = 0; i < 1000; i++) {
            testStrings[i] = "hello_" + i;
        }

        // Create a test file with sample content
        File testFile = new File(TEST_FILE_PATH);
        if (!testFile.exists()) {
            testFile.createNewFile();
        }

        try (FileWriter writer = new FileWriter(TEST_FILE_PATH)) {
            for (int i = 0; i < 1000; i++) {
                writer.write("hello world\n");
            }
        }
    }

    @Test
    void testGetBufferTiming() {
        long timeTaken = ChallengeQuestion.getBufferTiming(testStrings);
        assertTrue(timeTaken > 0, "Buffer timing should be greater than 0");
    }

    @Test
    void testGetBuilderTiming() {
        long timeTaken = ChallengeQuestion.getBuilderTiming(testStrings);
        assertTrue(timeTaken > 0, "Builder timing should be greater than 0");
    }

    @Test
    void testGetTimeTakenByFileReader() {
        ChallengeQuestion.filePath = TEST_FILE_PATH;
        long timeTaken = ChallengeQuestion.getTimeTakenByFileReader();
        assertTrue(timeTaken >= 0, "FileReader timing should be non-negative");
        assertTrue(ChallengeQuestion.wordCount2 > 0, "Word count should be greater than 0");
    }

    @Test
    void testGetTimeTakenByInputStreamReader() {
        ChallengeQuestion.filePath = TEST_FILE_PATH;
        long timeTaken = ChallengeQuestion.getTimeTakenByInputStreamReader();
        assertTrue(timeTaken >= 0, "InputStreamReader timing should be non-negative");
        assertTrue(ChallengeQuestion.wordCount1 > 0, "Word count should be greater than 0");
    }
    @BeforeEach
    void message(){
        System.out.println("running test "+count);

    }
    @AfterEach
    void aftermessage(){
        System.out.println("Test case "+count+" done !!!");
        count++;
    }

}
