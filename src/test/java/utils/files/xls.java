package utils.files;

import com.codeborne.xlstest.XLS;

import java.io.File;
import java.io.IOException;

public class xls {
    public static File getFile(String path) {
        return new File(path);
    }

    public static XLS getXls(String path) throws IOException {
        return new XLS(getFile(path));
    }
}
