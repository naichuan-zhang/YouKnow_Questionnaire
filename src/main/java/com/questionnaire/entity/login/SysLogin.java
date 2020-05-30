package com.questionnaire.entity.login;

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
public class SysLogin {
    private Integer loginId;
    private String username;
    private String password;
    private String email;
    private String wxname;
}
