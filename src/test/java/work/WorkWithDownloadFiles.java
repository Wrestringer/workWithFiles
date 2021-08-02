package work;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.files.txt.readTextFromFile;

public class WorkWithDownloadFiles {

    @Test
    void selenideDownloadReadmeTest() throws IOException {
        Configuration.downloadsFolder = "downloads";

        open("https://github.com/Wrestringer/workWithFiles/blob/main/README.md");
        File downloadedFile = $("#raw-url").download();
        String fileContent = readTextFromFile(downloadedFile);

        assertThat(fileContent, containsString("workWithFiles"));
    }

    @Test
    @Disabled
    void selenideDownloadReadmeWithTryTest() {
        open("https://github.com/Wrestringer/workWithFiles/blob/main/README.md");
        try {
            $("#raw-url").download();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
