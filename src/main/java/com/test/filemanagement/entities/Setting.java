package com.test.filemanagement.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "SETTING")
public class Setting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "maxFileSize")
    private double maxFileSize;
    @Column(name = "itemPerPage")
    private long itemPerPage;
    @Column(name = "mimeTypeAllowed")
    private String mimeTypeAllowed;
    @Column(name = "lastUpdatedTime")
    private Date lastUpdatedTime;

    public Setting() {
    }

    public Setting(long id, double maxFileSize, long itemPerPage, String mimeTypeAllowed, Date lastUpdatedTime) {
        this.id = id;
        this.maxFileSize = maxFileSize;
        this.itemPerPage = itemPerPage;
        this.mimeTypeAllowed = mimeTypeAllowed;
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public long getId() {
        return id;
    }

    public double getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(double maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public long getItemPerPage() {
        return itemPerPage;
    }

    public void setItemPerPage(long itemPerPage) {
        this.itemPerPage = itemPerPage;
    }

    public String getMimeTypeAllowed() {
        return mimeTypeAllowed;
    }

    public void setMimeTypeAllowed(String mimeTypeAllowed) {
        this.mimeTypeAllowed = mimeTypeAllowed;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
}
