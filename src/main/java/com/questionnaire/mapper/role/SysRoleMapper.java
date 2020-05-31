package com.questionnaire.mapper.role;

import com.questionnaire.entity.role.SysRole;
import com.questionnaire.entity.role.SysRoleTree;

import java.util.List;

/**
 * @author Naichuan Zhang
 * 31-May-2020
 **/
public interface SysRoleMapper {

    int deleteByPrimaryKey(Integer roleId);
    int insert(SysRole sysRole);
    int insertSelective(SysRole sysRole);
    SysRole selectByPrimaryKey(Integer roleId);
    int updateByPrimaryKeySelective(SysRole sysRole);
    int updateByPrimaryKey(SysRole sysRole);
    List<SysRoleTree> selectTreeAll();
}
