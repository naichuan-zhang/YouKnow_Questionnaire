package com.questionnaire.entity.questionnaire;

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
public class QuestionnaireMainUser {
    private String userId;
    private String mainId;
}
