package com.test.filemanagement.service;

import com.test.filemanagement.entities.Setting;

public interface SettingService {
    Setting getLastedSettings();

    Setting changeSetting(String setting);
}
