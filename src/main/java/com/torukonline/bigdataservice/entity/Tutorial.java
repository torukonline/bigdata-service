package com.torukonline.bigdataservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "bigdata", type = "tutorial", replicas = 1, shards = 5, createIndex = false)
public class Tutorial {
    private static final long serialVersionUID = 8449423540690186722L;
    @Id
    private String id;

    @Field
    private String keyword;

    @Field
    private String title;

    @Field
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "id='" + id + '\'' +
                ", keyword='" + keyword + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
