package cn.edu.swu.service.impl;

import cn.edu.swu.service.UploadService;
import cn.edu.swu.utils.UploadUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadServiceImpl implements UploadService {

    @Override
    public boolean uploadFile(String filePath, MultipartFile uploadFile)  {
       UploadUtil.uploadFiles(uploadFile,filePath);
        return true;
    }

    @Override
    public boolean uploadFiles(String path, MultipartFile[] uploadFiles){
        return UploadUtil.uploadFiles(uploadFiles,path);
    }

}
