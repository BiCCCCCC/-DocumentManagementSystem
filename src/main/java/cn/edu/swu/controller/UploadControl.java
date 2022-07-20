package cn.edu.swu.controller;
import cn.edu.swu.service.impl.UploadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadControl {

    @Value("${file.path}")
    private String path;

    @Autowired
    private UploadServiceImpl upload;
    //上传
    @RequestMapping(value = "/upload")
    @ResponseBody
    public String upload(MultipartFile [] uploadFiles){
        if( upload.uploadFiles(path,uploadFiles))
            return "success";
        else
            return "false";
    }

}
