package cn.edu.swu.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

public class PreviewUtil {

    public static ResponseEntity<byte[]> preview(String filepath, String filename) throws IOException {

        byte[] body= FileUtil.CreateFileByteArray(filepath, filename);
        //设置请求头
        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline"+";filename=" + URLEncoder.encode(filename,"UTF-8"));
        //设置响应状态
        HttpStatus statusCode = HttpStatus.OK;

        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
        return entity;//返回
    }
}
