package com.questionnaire.controller;

import com.questionnaire.entity.login.SysLogin;
import com.questionnaire.service.login.SysLoginService;
import com.questionnaire.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Naichuan Zhang
 * 30-May-2020
 **/
@Controller("loginController")
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private SysLoginService sysLoginService;

    @RequestMapping(value = "/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("../../login");
        return modelAndView;
    }

    @RequestMapping(value = "verification.do")
    public ModelAndView verification() {
        return null;
    }

    @RequestMapping(value = "register.do")
    public ModelAndView register(HttpServletRequest request, String username, String password,
                                 String repassword, String wxname, String email) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/login/index");
        if (username != null && !"".equals(username.trim()) && username.length() < 20
                && password != null && !"".equals(password.trim()) && password.equals(repassword)) {
            Long count = sysLoginService.selectByUsernameCount(username).get("count");
            if (count == 0) {
                SysLogin sysLogin = new SysLogin();
                sysLogin.setUsername(username);
                sysLogin.setPassword(MD5.md5(password));
                // TODO: FINISH THIS ...
            } else {
                modelAndView.addObject("msg", "该用户名已存在！");
            }
        }
        return modelAndView;
    }
}
