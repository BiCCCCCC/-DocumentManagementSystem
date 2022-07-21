package cn.edu.swu.utils;

import java.io.*;

public class FileUtil {
    public static byte[] CreateFileByteArray(String filepath,String filename) throws IOException {
        System.out.println(filename);
        //下载文件的路径(这里绝对路径)
        filepath= filepath+filename;
        File file =new File(filepath);
        //创建字节输入流，这里不实用Buffer类
        InputStream in = new FileInputStream(file);
        //available:获取输入流所读取的文件的最大字节数
        byte[] body = new byte[in.available()];
        //把字节读取到数组中
        in.read(body);
        in.close();
        return  body;
    }
}
