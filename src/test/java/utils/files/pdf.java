package utils.files;

import com.codeborne.pdftest.PDF;

import java.io.File;
import java.io.IOException;

public class pdf {
    public static PDF getPdf(String path) throws IOException {
        return new PDF(getFile(path));
    }

    public static File getFile(String path) {
        return new File(path);
    }
}
