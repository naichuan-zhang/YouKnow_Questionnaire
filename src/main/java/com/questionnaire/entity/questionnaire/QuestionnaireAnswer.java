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
public class QuestionnaireAnswer {
    private String answerId;
    private Integer answerValue;
    private String answerType;
    private String answerDestype;
    private String answerText;
    private String questionId;
    private Date answerCreat;
}