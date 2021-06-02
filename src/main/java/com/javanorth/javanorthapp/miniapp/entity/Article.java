package com.javanorth.javanorthapp.miniapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hefengen
 * @date 2020/02/02
 * @descprition: 文章实体
 */
@Getter
@Setter
@ToString
public class Article implements Cloneable {
    private Integer articleId;
    private String author;
    private String title;
    private String tags;
    private String thumb;
    private String category;
    private String content;
    private String publishTime;
    private String insertTime;
    private String updateTime;

    public Article() {
    }

    public Article(Integer articleId, String author, String title, String tags, String thumb, String category,
                   String content, String publishTime, String insertTime, String updateTime) {
        this.articleId = articleId;
        this.author = author;
        this.title = title;
        this.tags = tags;
        this.thumb = thumb;
        this.category = category;
        this.content = content;
        this.publishTime = publishTime;
        this.insertTime = insertTime;
        this.updateTime = updateTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
