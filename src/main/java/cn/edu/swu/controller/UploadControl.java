package cn.edu.swu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.IOException;

@Controller
public class UploadControl {

    //上传
    @RequestMapping(value = "/upload")
    @ResponseBody
    public void upload(String username, MultipartFile[] uploadFiles) throws IOException {
        System.out.println(username);
        System.out.println(uploadFiles[0].getOriginalFilename());
        File file = new File("E:\\springtmp\\" + uploadFiles[0].getOriginalFilename());
        uploadFiles[0].transferTo(file);
        System.out.println(uploadFiles[1].getOriginalFilename());
        file = new File("E:\\springtmp\\" + uploadFiles[1].getOriginalFilename());
        uploadFiles[1].transferTo(file);
    }

}
