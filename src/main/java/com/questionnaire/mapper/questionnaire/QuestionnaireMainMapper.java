package com.questionnaire.mapper.questionnaire;

import com.questionnaire.entity.questionnaire.QuestionnaireMain;

import java.util.List;
import java.util.Map;

public interface QuestionnaireMainMapper {

    List<QuestionnaireMain> selectPage(Map<String, Object> param);
    Map<String, Long> selectCount(Map<String,Object> param);
}
