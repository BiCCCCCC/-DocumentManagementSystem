package cn.edu.swu.service.impl;

import cn.edu.swu.service.PreviewService;
import cn.edu.swu.utils.PreviewUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class PreviewServiceImpl implements PreviewService {
    @Override
    public ResponseEntity<byte[]> previewService(String path, String filename) throws IOException {
            ResponseEntity<byte[]> entity= PreviewUtil.preview(path, filename);
            return entity;
    }
}
