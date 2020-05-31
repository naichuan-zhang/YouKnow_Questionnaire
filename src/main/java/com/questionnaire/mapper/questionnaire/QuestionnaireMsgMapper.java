package com.questionnaire.mapper.questionnaire;

import com.questionnaire.entity.questionnaire.QuestionnaireMsg;

import java.util.List;

public interface QuestionnaireMsgMapper {

    int deleteByPrimaryKey(String msgId);
    int insert(QuestionnaireMsg record);
    int insertSelective(QuestionnaireMsg record);
    QuestionnaireMsg selectByPrimaryKey(String msgId);
    int updateByPrimaryKeySelective(QuestionnaireMsg record);
    int updateByPrimaryKey(QuestionnaireMsg record);
    List<QuestionnaireMsg> selectByMainId(String mainId);
}
