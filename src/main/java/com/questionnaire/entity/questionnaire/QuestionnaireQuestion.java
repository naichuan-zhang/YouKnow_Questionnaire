package com.questionnaire.entity.questionnaire;

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
public class QuestionnaireQuestion {
    private String questionId;
    private String questionTitle;
    private Date questionCreat;
    private String questionDestype;
    private String questionType;
    private String mainId;
}
