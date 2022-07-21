package cn.edu.swu.utils;

import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;

public class UploadUtil {


    private static String getSuffix(MultipartFile uploadFile) {
        String suffix = uploadFile.getOriginalFilename();
        return suffix.substring(suffix.lastIndexOf(".") + 1);
    }

    private static boolean judgeSuffix(String suffix) {
        if (suffix.equals("exe") || suffix.isEmpty())
            return false;
        return true;
    }


    public static boolean uploadFiles(MultipartFile[] multipartFiles, String path) {
        for (MultipartFile multipartFile : multipartFiles) {
            uploadFile(multipartFile, path);
        }
        return true;
    }

    public static boolean uploadFile(MultipartFile uploadFile, String path) {
        String suffix = getSuffix(uploadFile);
        if (!judgeSuffix(suffix))
            return false;
        File file = new File(path + "/" + suffix, uploadFile.getOriginalFilename());
        if (!file.getParentFile().exists())
            (file.getParentFile()).mkdirs();
        return upload(uploadFile, file);
    }

    private static boolean upload(MultipartFile uploadFile, File file) {
        try {
            System.out.println(file.getAbsolutePath());
            uploadFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static Boolean deleteFile(String dirPath, String url) {
        //截取第四个“/”后面的字符串
        int i1 = url.indexOf('/');
        int i2 = url.indexOf('/', i1 + 1);
        int i3 = url.indexOf('/', i2 + 1);
        int i4 = url.indexOf("/", i3 + 1);
        String substring = url.substring(i4 + 1, url.length());
        String relPath = dirPath + substring;
        Boolean flag = false;
        File file = new File(relPath);
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        return flag;
    }
}


