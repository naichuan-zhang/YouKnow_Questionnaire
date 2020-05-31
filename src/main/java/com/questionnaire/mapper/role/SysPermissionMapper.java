package com.questionnaire.mapper.role;

import com.questionnaire.entity.role.SysPermission;

public interface SysPermissionMapper {

    int deleteByPrimaryKey(Integer permissionId);
    int insert(SysPermission sysPermission);
    int insertSelective(SysPermission sysPermission);
    SysPermission selectByPrimaryKey(Integer permissionId);
    int updateByPrimaryKeySelective(SysPermission sysPermission);
    int updateByPrimaryKey(SysPermission sysPermission);
}
