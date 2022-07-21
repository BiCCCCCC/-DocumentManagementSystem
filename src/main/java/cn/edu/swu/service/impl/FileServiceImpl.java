package cn.edu.swu.service.impl;

import cn.edu.swu.service.FileService;
import cn.edu.swu.utils.FileUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public List<String> getFilenames(String filepath) {
        return FileUtil.getAllFilenames(filepath);
    }
}
