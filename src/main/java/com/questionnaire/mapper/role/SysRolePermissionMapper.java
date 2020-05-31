package com.questionnaire.mapper.role;

import com.questionnaire.entity.role.SysRolePermission;

import java.util.List;

public interface SysRolePermissionMapper {

    int deleteByPrimaryKey(Integer id);
    int insert(SysRolePermission sysRolePermission);
    int insertSelective(SysRolePermission sysRolePermission);
    SysRolePermission selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(SysRolePermission sysRolePermission);
    int updateByPrimaryKey(SysRolePermission sysRolePermission);
    int deleteByRoleName (String roleName);
    List<SysRolePermission> selectByRoleName(String roleName);
}
