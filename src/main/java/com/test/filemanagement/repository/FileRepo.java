package com.test.filemanagement.repository;

import com.test.filemanagement.entities.UploadFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepo extends JpaRepository<UploadFile, Long> {

}
