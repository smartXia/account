package com.org.account.po;

import java.util.Date;

public class SessionGroup {
    private Integer id;

    private String appkey;

    private Integer channel;

    private String groupIdentity;

    private String relatedSessionIds;

    private Date createdAt;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey == null ? null : appkey.trim();
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getGroupIdentity() {
        return groupIdentity;
    }

    public void setGroupIdentity(String groupIdentity) {
        this.groupIdentity = groupIdentity == null ? null : groupIdentity.trim();
    }

    public String getRelatedSessionIds() {
        return relatedSessionIds;
    }

    public void setRelatedSessionIds(String relatedSessionIds) {
        this.relatedSessionIds = relatedSessionIds == null ? null : relatedSessionIds.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}