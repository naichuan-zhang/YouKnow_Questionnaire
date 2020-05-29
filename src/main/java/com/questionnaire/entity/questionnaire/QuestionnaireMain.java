package com.questionnaire.entity.questionnaire;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Naichuan Zhang
 * 29-May-2020
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionnaireMain {
    private String mainId;
    private String mainTitle;
    private String mainCreat;
    private String mainIsuse;
    private Date mainEndtime;
    private String mainCreatuser;
    private Integer mainCreatdep;
}
