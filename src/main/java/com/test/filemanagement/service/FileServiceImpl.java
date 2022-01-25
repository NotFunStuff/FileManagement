package com.test.filemanagement.service;

import com.test.filemanagement.entities.UploadFile;
import com.test.filemanagement.repository.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileRepo fileRepo;

    @Override
    public List<UploadFile> getAllFile() {
        List<UploadFile> files = new ArrayList<>();
        fileRepo.findAll().forEach(files::add);
        return files;
    }

    @Override
    public void saveFile(MultipartFile file) throws IOException {
        ArrayList<UploadFile> fileArrayList = (ArrayList<UploadFile>) getAllFile();
        int version = 1;
        for (int i = 0; i < fileArrayList.size(); i++) {
            if (file.getOriginalFilename().equals(fileArrayList.get(i).getName()))
                version = fileArrayList.get(i).getVersion() + 1;
        }
        UploadFile uploadedFile = new UploadFile(0, file.getOriginalFilename(), "F:\\Project\\filemanagement\\JSD\\images\\" + 0 + "/" + file.getOriginalFilename(), file.getSize(), file.getContentType(), 0, version, "uploaded", new Date(System.currentTimeMillis()), file.getOriginalFilename());
        fileRepo.save(uploadedFile);
        UploadFile uploadFile = fileRepo.getById(getLastedFileId());
        uploadFile.setPath("F:\\Project\\filemanagement\\JSD\\images\\" + getLastedFileId() + "/" + file.getOriginalFilename());
        fileRepo.save(uploadFile);
        File theDir = new File("F:\\Project\\filemanagement\\JSD\\images\\" + getLastedFileId());
        if (!theDir.exists()) {
            theDir.mkdirs();
        }
        String destination = "F:\\Project\\filemanagement\\JSD\\images\\" + getLastedFileId() + "/" + file.getOriginalFilename();
        File newfile = new File(destination);
        file.transferTo(newfile);
    }

    @Override
    public boolean deleteFile(long fileId) {
        ArrayList<UploadFile> fileArrayList = (ArrayList<UploadFile>) getAllFile();
        boolean isDone = false;
        for (int i = 0; i < fileArrayList.size(); i++) {
            if (fileId == fileArrayList.get(i).getId()) {
                String destination = "F:\\Project\\filemanagement\\JSD\\images\\" + fileArrayList.get(i).getId() + "/" + fileArrayList.get(i).getName();
                File newFile = new File(destination);
                newFile.delete();
                fileRepo.delete(fileArrayList.get(i));
                isDone = true;
            }
        }
        return isDone;
    }

    @Override
    public long getLastedFileId(){
        List<UploadFile> files = new ArrayList<>();
        fileRepo.findAll().forEach(files::add);
        long id = 0;
        for (int i =0; i < files.size(); i++){
            if (files.get(i).getId() > id)
                id = files.get(i).getId();
        }
        return id;
    }

    @Override
    public UploadFile downloadFile(long fileId) throws FileNotFoundException {
        ArrayList<UploadFile> fileArrayList = (ArrayList<UploadFile>) getAllFile();
        for (int i = 0; i < fileArrayList.size(); i++) {
            if (fileId == fileArrayList.get(i).getId()) {
//                String destination = "F:\\Project\\filemanagement\\JSD\\images\\" + fileArrayList.get(i).getId() + "/" + fileArrayList.get(i).getName();
//                File newFile = new File(destination);
                UploadFile update = fileArrayList.get(i);
                update.setNumberOfDownload(update.getNumberOfDownload() + 1);
                fileRepo.save(update);
                update.setPath("images\\" + update.getId() +"\\"+ update.getName());
                return update;
            }
        }
        return null;
    }
}