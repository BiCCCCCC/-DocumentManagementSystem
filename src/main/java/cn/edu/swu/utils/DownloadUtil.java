package cn.edu.swu.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

import java.io.IOException;
import java.net.URLEncoder;

public class DownloadUtil {

    public static ResponseEntity<byte[]> download(String filepath,String filename) throws IOException {

        byte[] body= FileUtil.createFileByteArray(filepath, filename);
        //设置请求头
        MultiValueMap<String, String> headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment"+";filename=" + URLEncoder.encode(filename,"UTF-8"));
        //设置响应状态
        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
        return entity;//返回
    }


}
