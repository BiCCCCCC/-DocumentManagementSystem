package cn.edu.swu.controller;

import cn.edu.swu.service.impl.PreviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/preview")
public class PreviewController {


    @Autowired
    private PreviewServiceImpl previewService;
    @Value("${preview.path}")
    private String previewPath;

    @RequestMapping(value = "/{filename}.{suffix}")
    public ResponseEntity<byte[]> download(@PathVariable String filename, @PathVariable String suffix) throws IOException {
        ResponseEntity<byte[]> entity = previewService.previewService(previewPath, filename + "." + suffix);
        return entity;//返回
    }


}