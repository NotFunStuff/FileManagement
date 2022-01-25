package com.test.filemanagement.controller;

import com.test.filemanagement.entities.Setting;
import com.test.filemanagement.service.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SettingController {
    final String org = "http://127.0.0.1:5500";

    @Autowired
    SettingService settingService;

    @GetMapping(value = "/setting")
    @CrossOrigin(origins = org)
    public Setting getSetting() {
        return settingService.getLastedSettings();
    }

    @PostMapping(value = "/saveSetting")
    @CrossOrigin(origins = org)
    public void saveSetting(@RequestBody String setting) {
        System.out.println(setting);
        settingService.changeSetting(setting);
    }
}
