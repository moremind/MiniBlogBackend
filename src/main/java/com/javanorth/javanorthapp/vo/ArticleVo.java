package com.javanorth.javanorthapp.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ArticleVo {
    private Integer articleId;
    private String title;
    private String author;
    private String tags;
    private String category;
    private String content;
    private String publishTime;
}
