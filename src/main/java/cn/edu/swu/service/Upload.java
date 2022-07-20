package cn.edu.swu.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

public interface Upload {
    public boolean uploadFile(String filePath, MultipartFile uploadFile) throws IOException;

    public boolean uploadFiles(String txtPath,String picPath ,MultipartFile[] uploadFiles) throws IOException;

    public String uploadImg(List<MultipartFile> fileList, HttpServletRequest request);
}
