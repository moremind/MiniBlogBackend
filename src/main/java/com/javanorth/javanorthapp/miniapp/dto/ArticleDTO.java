package com.javanorth.javanorthapp.miniapp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ArticleDTO {
    private String title;
    private String author;
    private String tags;
    private String category;
    private String content;
}
