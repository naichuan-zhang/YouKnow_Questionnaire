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
public class SysRole {
    private Integer roleId;
    private String roleName;
    private String roleDes;
    private Integer rolePid;
}
