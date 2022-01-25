package com.test.filemanagement.repository;

import com.test.filemanagement.entities.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingRepo extends JpaRepository<Setting, Long> {
}
