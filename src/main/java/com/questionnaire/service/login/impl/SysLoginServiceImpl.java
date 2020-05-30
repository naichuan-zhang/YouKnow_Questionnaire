package com.questionnaire.service.login.impl;

import com.questionnaire.mapper.login.SysLoginMapper;
import com.questionnaire.service.login.SysLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Naichuan Zhang
 * 30-May-2020
 **/
@Service("sysLoginService")
public class SysLoginServiceImpl implements SysLoginService {

    @Autowired
    private SysLoginMapper sysLoginMapper;

    @Override
    public Map<String, Long> selectByUsernameCount(String username) {
        return sysLoginMapper.selectByUsernameCount(username);
    }
}
