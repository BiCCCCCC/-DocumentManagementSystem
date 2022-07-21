package cn.edu.swu.service.impl;

import cn.edu.swu.service.DownloadService;
import cn.edu.swu.utils.DownloadUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class DownloadServiceImpl implements DownloadService {
    @Override
    public ResponseEntity<byte[]> downloadService(String path, String filename) throws IOException {
        ResponseEntity<byte[]> entity= DownloadUtil.download(path, filename);
        return entity;
    }
}
