package com.test.filemanagement.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "FILE")
public class UploadFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "path")
    private String path;
    @Column(name = "file_size")
    private double fileSize;
    @Column(name = "mime")
    private String mime;
    @Column(name = "numberOfDownload")
    private int numberOfDownload;
    @Column(name = "version")
    private int version;
    @Column(name = "status")
    private String status;
    @Column(name = "createdDataTime")
    private Date createdDataTime;
    @Column(name = "versionIds")
    private String versionIds;

    public UploadFile() {
    }

    public UploadFile(long id, String name, String path, double fileSize, String mime, int numberOfDownload, int version, String status, Date createdDataTime, String versionIds) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.fileSize = fileSize;
        this.mime = mime;
        this.numberOfDownload = numberOfDownload;
        this.version = version;
        this.status = status;
        this.createdDataTime = createdDataTime;
        this.versionIds = versionIds;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public int getNumberOfDownload() {
        return numberOfDownload;
    }

    public void setNumberOfDownload(int numberOfDownload) {
        this.numberOfDownload = numberOfDownload;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedDataTime() {
        return createdDataTime;
    }

    public void setCreatedDataTime(Date createdDataTime) {
        this.createdDataTime = createdDataTime;
    }

    public String getVersionIds() {
        return versionIds;
    }

    public void setVersionIds(String versionIds) {
        this.versionIds = versionIds;
    }
}
