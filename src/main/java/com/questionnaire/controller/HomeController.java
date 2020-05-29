package com.questionnaire.controller;

import com.questionnaire.entity.questionnaire.QuestionnaireMain;
import com.questionnaire.service.questionnaire.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Naichuan Zhang
 * 29-May-2020
 **/
@Controller("homeController")
public class HomeController {

    @Autowired
    private QuestionnaireService questionnaireService;

    @RequestMapping(value = "/home")
    public ModelAndView home(@RequestParam(name = "page", defaultValue = "0") Integer page,
                             @RequestParam(name = "row", defaultValue = "10") Integer row) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        Map<String, Object> params = new HashMap<>();
        if (page > 0)
            params.put("page", (page - 1) * row);
        else
            params.put("page", page);
        params.put("row", row);
        params.put("mainEndtime", new Date());
        params.put("mainIsuse", "y");
        List<QuestionnaireMain> questionnaireMainList = questionnaireService.findMainPage(params);
        Integer count = questionnaireService.findCount(params);
        Integer countPage;
        if (count % row == 0) {
            countPage = count / row;
        } else {
            countPage = count / row + 1;
        }
//        String currentPage;
//        if (page >0){
//            currentPage = ut.page(page, Integer.valueOf(countPage+""));
//        }else{
//            currentPage = ut.page(page+1, Integer.valueOf(countPage+""));
//        }
        modelAndView.addObject("mainList", questionnaireMainList);
        return modelAndView;
    }
}
