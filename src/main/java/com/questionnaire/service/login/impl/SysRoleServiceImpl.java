package com.questionnaire.service.login.impl;

import com.questionnaire.mapper.role.SysRoleMapper;
import com.questionnaire.service.login.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Naichuan Zhang
 * 31-May-2020
 **/
@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;


}
