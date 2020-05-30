package com.questionnaire.service.questionnaire;

import com.questionnaire.entity.questionnaire.QuestionnaireMain;
import com.questionnaire.mapper.questionnaire.QuestionnaireMainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Naichuan Zhang
 * 29-May-2020
 **/
@Service("questionnaireService")
public class QuestionnaireService {

    @Autowired
    private QuestionnaireMainMapper questionnaireMainMapper;


    public List<QuestionnaireMain> findMainPage(Map<String, Object> params) {
        return questionnaireMainMapper.selectPage(params);
    }

    public Long findCount(Map<String, Object> params) {
        Map<String, Long> map = questionnaireMainMapper.selectCount(params);
        return map.get("count");
    }
}
