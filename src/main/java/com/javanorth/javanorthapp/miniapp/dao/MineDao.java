package com.javanorth.javanorthapp.miniapp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface MineDao {
    String getAbout();

    String getCopyright();
}
