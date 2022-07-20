package cn.edu.swu.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface UploadService {
    public boolean uploadFile(String filePath, MultipartFile uploadFile) throws IOException;

    public boolean uploadFiles(String path, MultipartFile[] uploadFiles) throws IOException;


}
