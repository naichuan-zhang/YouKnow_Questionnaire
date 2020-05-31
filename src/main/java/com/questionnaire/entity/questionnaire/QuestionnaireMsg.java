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
public class QuestionnaireMsg {
    private String msgId;
    private String msgText;
    private String mainId;
    private String msgCreatuser;
    private Date msgCreattime;
}
