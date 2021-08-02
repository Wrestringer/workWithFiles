package work;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.files.txt.readTextFromPath;


public class WorkWithTxt {
    @Test
    void txtTest() throws IOException {
        String txtFilePath = "./src/test/resources/files/1.txt";
        String expectedData = "Hello! This is my notepad";

        String actualData = readTextFromPath(txtFilePath);

        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void csvTest() throws IOException {
        String csvFilePath = "./src/test/resources/files/1.csv";
        String expectedData = "hello qa.guru students!";

        String actualData = readTextFromPath(csvFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}
