package cn.edu.swu.controller;
import cn.edu.swu.service.impl.Upload1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;

@Controller
public class UploadControl {

    //上传
    @RequestMapping(value = "/upload")
    @ResponseBody
    public void upload(String username, MultipartFile[] uploadFiles) throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        Upload1 upload=app.getBean(Upload1.class);
        upload.uploadFiles(upload.getTxtPath(),upload.getPicPath(),uploadFiles);
    }

}
