package top.devoty.util;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class FileUtil {
    public static String readFile(File file){
        try {
            String content = FileUtils.readFileToString(file, "utf-8");
            return content;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean saveFile(MultipartFile multipartFile, File dest){
        try {
            multipartFile.transferTo(dest);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
