package com.javanorth.javanorthapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ArticleEntity {
    private Integer articleId;
    private String title;
    private String author;
    private String tags;
    private String thumb;
    private String category;
    private String publishTime;
}
