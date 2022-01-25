package com.test.filemanagement.controller;

import com.test.filemanagement.entities.UploadFile;
import com.test.filemanagement.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@RestController
public class FileController {
    final String org = "http://127.0.0.1:5500";
    @Autowired
    FileService fileService;

    @GetMapping(value = "/files")
    @CrossOrigin(origins = org)
    public List<UploadFile> getFiles() {
        return fileService.getAllFile();
    }

    @PostMapping(value = "/upload")
    @CrossOrigin(origins = org)
    public void uploadFile(@RequestBody MultipartFile file) throws IOException {
        fileService.saveFile(file);
    }

    @DeleteMapping(value = "/delete")
    @CrossOrigin(origins = org)
    public boolean deleteFile(@RequestParam long fileId) {
        return fileService.deleteFile(fileId);
    }

    @GetMapping(value = "/download")
    @CrossOrigin(origins = org)
    public UploadFile downloadFile(@RequestParam long fileId) throws FileNotFoundException {
        return fileService.downloadFile(fileId);
    }
}
