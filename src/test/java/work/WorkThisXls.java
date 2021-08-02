package work;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.files.xls.*;
import static utils.files.xlsx.*;


public class WorkThisXls {

    @Test
    void xlsSimpleTest() throws IOException {
        String xlsFilePath = "./src/test/resources/files/Книга 1.xls";
        String expectedData = "Hello! This is my notepad";

        XLS xls = getXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expectedData));
    }

    @Test
    void xlsCellTest() throws IOException {
        String xlsFilePath = "./src/test/resources/files/Книга 1.xls";
        String expectedData = "Hello! This is my notepad";

        XLS xls = getXls(xlsFilePath);
        String actualData = xls.excel.getSheetAt(0).getRow(0).getCell(0).toString();
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void xlsxTest() {
        String xlsFilePath = "./src/test/resources/files/Книга 1.xlsx";
        String expectedData = "Hello! This is my notepad";

        String actualData = getXlsx(xlsFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
