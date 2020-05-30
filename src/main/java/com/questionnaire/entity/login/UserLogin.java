package com.questionnaire.entity.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Naichuan Zhang
 * 30-May-2020
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLogin extends UserLoginKey {
    private String password;
    private String role;
    private String infoName;
    private Integer age;
    private String sex;
    private String tell;
    private String sfzh;
    private String address;
    private Date creatDate;
    private Date updateDate;
}
