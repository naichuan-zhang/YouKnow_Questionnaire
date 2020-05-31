package com.questionnaire.mapper.questionnaire;

import com.questionnaire.entity.questionnaire.QuestionnaireMainUser;

import java.util.Map;

public interface QuestionnaireMainUserMapper {

    int deleteByPrimaryKey(String userId);
    int insert(QuestionnaireMainUser record);
    int insertSelective(QuestionnaireMainUser record);
    QuestionnaireMainUser selectByPrimaryKey(String userId);
    int updateByPrimaryKeySelective(QuestionnaireMainUser record);
    int updateByPrimaryKey(QuestionnaireMainUser record);
    QuestionnaireMainUser selectByMainIDUserId(Map<String,String> params);
}
