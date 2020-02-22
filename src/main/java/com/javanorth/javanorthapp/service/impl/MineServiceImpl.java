package com.javanorth.javanorthapp.service.impl;

import com.javanorth.javanorthapp.dao.MineDao;
import com.javanorth.javanorthapp.service.MineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MineServiceImpl implements MineService {
    private Logger logger = LoggerFactory.getLogger(Logger.class);

    @Autowired
    MineDao mineDao;

    @Override
    public String getAbout() {
        try {
            return mineDao.getAbout();
        } catch (Exception e) {
            logger.error(e.getCause().toString());
        }
        return null;
    }

    @Override
    public String getCopyright() {
        try {
            return mineDao.getCopyright();
        } catch (Exception e) {
            logger.error(e.getCause().toString());
        }
        return null;
    }
}
