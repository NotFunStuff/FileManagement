package com.test.filemanagement.service;

import com.test.filemanagement.entities.UploadFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface FileService {
    List<UploadFile> getAllFile();

    void saveFile(MultipartFile file) throws IOException;

    boolean deleteFile(long fileId);

    long getLastedFileId();

    UploadFile downloadFile(long fileId) throws FileNotFoundException;
}
