package com.questionnaire.mapper.questionnaire;

import com.questionnaire.entity.questionnaire.QuestionnaireAnswer;

import java.util.List;

public interface QuestionnaireAnswerMapper {
    int deleteByPrimaryKey(String answerId);
    int insert(QuestionnaireAnswer record);
    int insertSelective(QuestionnaireAnswer record);
    QuestionnaireAnswer selectByPrimaryKey(String answerId);
    int updateByPrimaryKeySelective(QuestionnaireAnswer record);
    int updateByPrimaryKey(QuestionnaireAnswer record);
    List<QuestionnaireAnswer> selectByQuestionId(String[] questionIds);
    int deleteByQuestionId(String questionId);
    int updateValueIn(List<String> answerIds);
}
