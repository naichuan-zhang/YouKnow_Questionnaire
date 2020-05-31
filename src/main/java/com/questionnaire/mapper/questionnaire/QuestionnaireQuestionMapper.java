package com.questionnaire.mapper.questionnaire;

import com.questionnaire.entity.questionnaire.QuestionnaireQuestion;

import java.util.List;

public interface QuestionnaireQuestionMapper {

    int deleteByPrimaryKey(String questionId);
    int insert(QuestionnaireQuestion record);
    int insertSelective(QuestionnaireQuestion record);
    QuestionnaireQuestion selectByPrimaryKey(String questionId);
    int updateByPrimaryKeySelective(QuestionnaireQuestion record);
    int updateByPrimaryKey(QuestionnaireQuestion record);
    List<QuestionnaireQuestion> selectByMainId(String mainId);
}
