package com.questionnaire.mapper.role;

import com.questionnaire.entity.login.SysLogin;

import java.util.List;
import java.util.Map;

public interface SysLoginMapper {

    int deleteByPrimaryKey(Integer loginId);
    int insert(SysLogin sysLogin);
    SysLogin selectByPrimaryKey(Integer loginId);
    Map<String, Long> selectByUsernameCount(String username);
    int insertSelective(SysLogin sysLogin);
    SysLogin selectByUsername(String username);

    /**
     * @param params role_id, login_id, username
     * @return
     */
    int insertSysLoginRoleSelective(Map<String, Object> params);
    int updateByPrimaryKeySelective(SysLogin sysLogin);
    int updateByPrimaryKey(SysLogin sysLogin);
    int updateSysLoginRoleSelective(Map<String, Object> params);
    List<SysLogin> selectPage(Map<String, Object> params);
    Map<String, Long> selectCount();
}
