package com.questionnaire.controller;

import com.questionnaire.entity.questionnaire.QuestionnaireMain;
import com.questionnaire.service.questionnaire.QuestionnaireService;
import com.questionnaire.standard.Util;
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

    @Autowired
    private Util util;

    @RequestMapping(value = "/home")
    public ModelAndView home(@RequestParam(name = "page", defaultValue = "0") Integer page,
                             @RequestParam(name = "row", defaultValue = "10") Integer row) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        Map<String, Object> params = new HashMap<>();
        if (page > 0)
            params.put("page", (page - 1) * row);
        else
            params.put("page", page);
        params.put("row", row);
        params.put("mainEndtime", new Date());
        params.put("mainIsuse", "y");
        List<QuestionnaireMain> questionnaireMainList = questionnaireService.findMainPage(params);
        // total number of records
        Long totalRecordNumber = questionnaireService.findCount(params);
        // total number of pages
        Long totalPageNumber = 0L;
        if (totalRecordNumber % row == 0)
            totalPageNumber = totalRecordNumber / row;
        else
            totalPageNumber = totalRecordNumber / row + 1;
        // 当不是显示第一页时
        String pageHtml;
        if (page > 0) {
            pageHtml = util.getPageHtml(page, Integer.valueOf(totalPageNumber + ""));
        } else {
            pageHtml = util.getPageHtml(page + 1, Integer.valueOf(totalPageNumber + ""));
        }
        modelAndView.addObject("mainList", questionnaireMainList);
        modelAndView.addObject("pageHtml", pageHtml);
        return modelAndView;
    }
}
