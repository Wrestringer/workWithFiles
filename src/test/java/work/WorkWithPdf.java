package work;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.files.pdf.getPdf;

public class WorkWithPdf {

    @Test
    void pdfTest() throws IOException {
        String pdfFilePath = "./src/test/resources/files/documentation.pdf";
        String expectedData = "Плохой софт не имеет документации";

        PDF pdf = getPdf(pdfFilePath);
        assertThat(pdf, PDF.containsText(expectedData));
    }

}
