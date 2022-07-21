package cn.edu.swu.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static byte[] createFileByteArray(String filePath, String filename) throws IOException {
        //下载文件的路径(这里绝对路径)
        filePath = filePath + filename;
        File file = new File(filePath);
        //创建字节输入流，这里不实用Buffer类
        InputStream in = new FileInputStream(file);
        //available:获取输入流所读取的文件的最大字节数
        byte[] body = new byte[in.available()];
        //把字节读取到数组中
        in.read(body);
        in.close();
        return body;
    }

    //获取指定目录的所有文件以及目录
    public static List<String> getAllFilenames(String filePath) {
        List<String> filenams = new ArrayList<>();
        File fileParent = new File(filePath);
        if (!fileParent.isDirectory())
            return null;
        File[] files = fileParent.listFiles();
        if (files != null) {
            for (File file : files
            ) {
                filenams.add(file.getName());
            }
        }
        return filenams;
    }
    //获取指定目录的相同类型文件
    public static List<String> getFilenamesByType(String filePath) {
        List<String> filenams = new ArrayList<>();
        return filenams;
    }
}
