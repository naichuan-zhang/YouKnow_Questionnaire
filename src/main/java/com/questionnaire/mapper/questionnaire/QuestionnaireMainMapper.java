package com.questionnaire.mapper.questionnaire;

import com.questionnaire.entity.questionnaire.QuestionnaireMain;

import java.util.List;
import java.util.Map;

public interface QuestionnaireMainMapper {

    int deleteByPrimaryKey(String mainId);
    int insert(QuestionnaireMain record);
    int insertSelective(QuestionnaireMain record);
    QuestionnaireMain selectByPrimaryKey(String mainId);
    QuestionnaireMain selectByMainIsuse();
    List<QuestionnaireMain> selectPage(Map<String, Object> param);
    Map<String, Long> selectCount(Map<String,Object> param);
    int updateByPrimaryKeySelective(QuestionnaireMain record);
    int updateByPrimaryKey(QuestionnaireMain record);
    int delCheck(String[] mainIds);
    int updateMainIsuseN();
    int updateMainCreat (String mainId);
}
