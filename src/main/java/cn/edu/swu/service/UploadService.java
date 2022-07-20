package cn.edu.swu.service;

import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;


public interface UploadService {
    public boolean uploadFile(String filePath, MultipartFile uploadFile) throws IOException;

    public boolean uploadFiles(String path, MultipartFile[] uploadFiles) throws IOException;


}
