package com.questionnaire.mapper.role;

import com.questionnaire.entity.role.SysPermissionTree;

import java.util.List;

public interface SysPermissionTreeMapper {

    List<SysPermissionTree> selectAll();
    int deleteByPrimaryKey(Integer id);
}
