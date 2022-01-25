package com.test.filemanagement.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.test.filemanagement.entities.Setting;
import com.test.filemanagement.repository.SettingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class SettingServiceImpl implements SettingService {

    @Autowired
    private SettingRepo settingRepo;

    @Override
    public Setting getLastedSettings() {
        if (settingRepo.count() == 0) {
            return null;
        }
        return settingRepo.findById(settingRepo.count()).get();
    }

    @Override
    public Setting changeSetting(String setting) {
        Gson gson = new GsonBuilder().setDateFormat("dd/MMM/yyyy HH:mm:ss").create();
        Setting set = gson.fromJson(setting, Setting.class);
        set.setLastUpdatedTime(new Date(System.currentTimeMillis()));
        return settingRepo.save(set);
    }
}
