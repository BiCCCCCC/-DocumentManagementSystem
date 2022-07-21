package cn.edu.swu.service;

import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface DownloadService {
    public ResponseEntity<byte[]> downloadService(String path, String filename) throws IOException;
}
