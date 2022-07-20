package cn.edu.swu.service.impl;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class Upload1 implements cn.edu.swu.service.Upload {
    private String txtPath;
    private String picPath;

    @Override
    public boolean uploadFile(String filePath, MultipartFile uploadFile) throws IOException {
        File file = new File(filePath);
        if (uploadFile == null)
            return false;
        uploadFile.transferTo(file);
        return true;
    }

    @Override
    public boolean uploadFiles(String txtPath, String picPath, MultipartFile[] uploadFiles) throws IOException {
        return false;
    }


    public String getTxtPath() {
        return txtPath;
    }

    public void setTxtPath(String txtPath) {
        this.txtPath = txtPath;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}
