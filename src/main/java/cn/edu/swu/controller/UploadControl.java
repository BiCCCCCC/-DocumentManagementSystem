package cn.edu.swu.controller;
import cn.edu.swu.service.impl.UploadImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class UploadControl {
    @Autowired
    private UploadImpl upload;
    //上传
    @RequestMapping(value = "/upload")
    @ResponseBody
    public String upload(List<MultipartFile> uploadFiles, HttpServletRequest request) throws IOException {
        return upload.uploadImg(uploadFiles,request);
    }

}
