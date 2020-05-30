package com.questionnaire.entity.role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Naichuan Zhang
 * 30-May-2020
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysRolePermission {
    private Integer id;
    private Integer roleId;
    private Integer permissionId;
    private String roleName;
}
