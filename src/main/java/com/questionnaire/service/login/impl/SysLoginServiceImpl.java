package com.questionnaire.service.login.impl;

import com.questionnaire.entity.login.SysLogin;
import com.questionnaire.mapper.role.SysLoginMapper;
import com.questionnaire.service.login.SysLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Naichuan Zhang
 * 30-May-2020
 **/
@Service("sysLoginService")
@Transactional
public class SysLoginServiceImpl implements SysLoginService {

    @Autowired
    private SysLoginMapper sysLoginMapper;

    @Override
    public Map<String, Long> selectByUsernameCount(String username) {
        return sysLoginMapper.selectByUsernameCount(username);
    }

    @Override
    public int insertSelective(SysLogin sysLogin) {
        int result = 0;
        if (sysLoginMapper.insertSelective(sysLogin) == 1) {
            result += 1;
            sysLogin = selectByUsername(sysLogin.getUsername());
            Map<String, Object> params = new HashMap<>();
            params.put("login_id", sysLogin.getLoginId());
            params.put("role_id", 3);
            params.put("username", sysLogin.getUsername());
            result += insertSysLoginRoleSelective(params);
        }
        return result;
    }

    @Override
    public SysLogin selectByUsername(String username) {
        return sysLoginMapper.selectByUsername(username);
    }

    @Override
    public int insertSysLoginRoleSelective(Map<String, Object> params) {
        return sysLoginMapper.insertSysLoginRoleSelective(params);
    }
}
