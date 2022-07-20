package cn.edu.swu.controller;
import cn.edu.swu.service.impl.UploadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

    @Value("${upload.path}")
    private String path;

    @Autowired
    private UploadServiceImpl upload;
    //多文件上传
    @RequestMapping(value = "/upload")
    @ResponseBody
    public String upload(MultipartFile [] uploadFiles){

        if( upload.uploadFiles(path,uploadFiles))
            return "success";
        else
            return "false";
    }

    //单文件上传
    @RequestMapping(value = "/upload1")
    @ResponseBody
    public String upload1(MultipartFile uploadFile){
        if( upload.uploadFile(path,uploadFile))
            return "success";
        else
            return "false";
    }
}
