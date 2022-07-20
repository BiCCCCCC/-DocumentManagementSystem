package cn.edu.swu.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface Upload {
    public boolean uploadFile(String filePath, MultipartFile uploadFile) throws IOException;

    public boolean uploadFiles(String txtPath,String picPath ,MultipartFile[] uploadFiles) throws IOException;


}
