package com.javanorth.javanorthapp.miniapp.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Category {
    private Integer id;
    private String origin;
    private String value;
    private String url;
    private String image;
}
