package cn.edu.swu.service;

import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface PreviewService {
    public ResponseEntity<byte[]> previewService(String path, String filename) throws IOException;
}
