package com.carflow.backend.module.attachmentModule.infrastructure.boundary.out.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AttachmentEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private Boolean isArchived;
    private String name;
    private String description;
    private String url;

    public AttachmentEntity() {
    }

    public AttachmentEntity(Integer id, Boolean isArchived, String name, String description, String url) {
        this.id = id;
        this.isArchived = isArchived;
        this.name = name;
        this.description = description;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getArchived() {
        return isArchived;
    }

    public void setArchived(Boolean archived) {
        isArchived = archived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
