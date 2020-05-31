package com.questionnaire.mapper.role;

import com.questionnaire.entity.login.SysUserInfo;

public interface SysUserInfoMapper {

    int deleteByPrimaryKey(String id);
    int insert(SysUserInfo sysUserInfo);
    int insertSelective(SysUserInfo sysUserInfo);
    SysUserInfo selectByPrimaryKey(String id);
    int updateByPrimaryKeySelective(SysUserInfo sysUserInfo);
    int updateByPrimaryKey(SysUserInfo sysUserInfo);
}
