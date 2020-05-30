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
public class SysRoleTree {
    private Integer id;
    private String type;
    private Integer pId;
    private String name;
}
