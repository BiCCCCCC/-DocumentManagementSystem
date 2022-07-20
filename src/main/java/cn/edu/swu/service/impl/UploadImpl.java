package cn.edu.swu.service.impl;

import cn.edu.swu.service.Upload;
import cn.edu.swu.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;


public class UploadImpl implements Upload {
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
        for (MultipartFile uploadFile : uploadFiles) {
            String suffix = uploadFile.getOriginalFilename();
            suffix= suffix.substring(suffix.lastIndexOf(".") + 1);
            System.out.println(suffix);
        }
        return false;
    }

    //获取根路径
    @Value("${file.path}")
    private String dirPath;



    @Override
    public String uploadImg(List<MultipartFile> fileList, HttpServletRequest request) {
        Boolean img = UploadUtil.checkImg(fileList);
        if (img){
            String URL=UploadUtil.upload(fileList,request,dirPath);
            return URL;
        }else {
            return "请上传bmp/gif/jpg/png格式的图片";
        }
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
