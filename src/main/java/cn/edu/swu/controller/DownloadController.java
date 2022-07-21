package cn.edu.swu.controller;

import cn.edu.swu.service.impl.DownloadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.*;


@Controller
public class DownloadController {

    @Autowired
    private DownloadServiceImpl downloadService;
    @Value("${download.path}")
    private String downloadPath;


    @RequestMapping(value = "/download/{filename}.{suffix}")
    public ResponseEntity<byte[]> download(@PathVariable String filename,@PathVariable String suffix) throws IOException {
        ResponseEntity<byte[]> entity = downloadService.downloadService(downloadPath,filename+"."+suffix);
        return entity;//返回
    }


}
