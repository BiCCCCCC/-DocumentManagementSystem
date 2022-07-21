package cn.edu.swu.controller;


import cn.edu.swu.service.impl.DownloadServiceImpl;
import cn.edu.swu.service.impl.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileServiceImpl fileService;
    @Value("${download.path}")
    private String filePath;


    @RequestMapping("/getAllFilenames")
    @ResponseBody
    public List<String> getAllFilenames()  {
        return fileService.getFilenames(filePath);
    }

}
