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
public class SysPermission {
    private Integer permissionId;
    private String permissionName;
    private String permissionMenuName;
    private String permissionMenuPid;
}
