package com.questionnaire.entity.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Naichuan Zhang
 * 30-May-2020
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysUserInfo {
    private String id;
    private String username;
    private Integer role;
    private Integer nianl;
    private String shenfzh;
    private String zhensxm;
    private String zhuz;
    private String tec;
    private String dianh;
    private Integer xingb;
    private Date chusrq;
    private Integer zhanghzt;
    private String youx;
    private String yulzd1;
    private String yulzd2;
    private String yulzd3;
    private String yulzd4;
    private String yulzd5;
    private Date updateDate;
    private String updateUser;
    private Date creatDate;
    private String creatUser;
    private String beiz;
}
