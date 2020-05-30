package com.questionnaire.entity.workday;

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
public class WorkDay {
    private String workId;
    private String workTitle;
    private Date workStart;
    private Date workEnd;
    private String workColor;
    private String workScope;
}
