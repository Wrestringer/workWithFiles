package utils.files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class txt {

    public static File getFile(String path) {
        return new File(path);
    }

    public static String readTextFromFile(File file) throws IOException {
        return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
    }

    public static String readTextFromPath(String path) throws IOException {
        return readTextFromFile(getFile(path));
    }
}
