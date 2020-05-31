package com.questionnaire.controller;

import com.questionnaire.entity.login.SysLogin;
import com.questionnaire.service.login.SysLoginService;
import com.questionnaire.service.login.SysRoleService;
import com.questionnaire.util.EmailValidation;
import com.questionnaire.util.MD5;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Naichuan Zhang
 * 30-May-2020
 **/
@Controller("loginController")
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private SysLoginService sysLoginService;

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping(value = "/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("../../login");
        return modelAndView;
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
                // 可以注册该用户
                SysLogin sysLogin = new SysLogin();
                sysLogin.setUsername(username);
                sysLogin.setPassword(MD5.md5(password));
                // 检查邮箱
                if (email != null && !"".equals(email.trim()) && EmailValidation.isEmail(email)) {
                    sysLogin.setEmail(email);
                }
                if (wxname != null && !"".equals(wxname.trim())) {
                    sysLogin.setWxname(wxname);
                }
                if (sysLoginService.insertSelective(sysLogin) > 0) {
                    modelAndView.addObject("msg", "注册成功");
                }
            } else {
                modelAndView.addObject("msg", "该用户名已存在！");
            }
        }
        return modelAndView;
    }

    @RequestMapping(value = "verification.do")
    public ModelAndView login(HttpServletRequest request, String username, String password,
                              @RequestParam(defaultValue = "0000") String verifyCode, Model model) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession();
        String sessionVerifyCode = "0000";
        if (sessionVerifyCode != null && sessionVerifyCode.equals(verifyCode)) {
            session.setAttribute("verifyCode", MD5.md5(Math.random() + ""));
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            Subject currentUser = SecurityUtils.getSubject();
            try {
                currentUser.login(token);
                SysLogin sysLogin = sysLoginService.selectByUsername(username);
                session.setAttribute("username", username);
                session.setAttribute("sysLogin", sysLogin);
                modelAndView.setViewName("redirect:/home");
            } catch (IncorrectCredentialsException e) {
                model.addAttribute("message", "Password for account " + token.getPrincipal() + " was wrong!");
                modelAndView.setViewName("redirect:/login.jsp");
            } catch (ExcessiveAttemptsException e) {
                model.addAttribute("message", "Excessive attempts!");
                modelAndView.setViewName("redirect:/login.jsp");
            } catch (UnknownAccountException e) {
                model.addAttribute("message", "Username does not exist!");
                modelAndView.setViewName("redirect:/login.jsp");
            } catch (LockedAccountException e) {
                model.addAttribute("message", "The account has been locked!");
                modelAndView.setViewName("redirect:/login.jsp");
            } catch (DisabledAccountException e) {
                model.addAttribute("message", "The account has been disabled!");
                modelAndView.setViewName("redirect:/login.jsp");
            } catch (ExpiredCredentialsException e) {
                model.addAttribute("message", "Expired credentials!");
                modelAndView.setViewName("redirect:/login.jsp");
            } catch (UnauthorizedException e) {
                model.addAttribute("message", "You are unauthorized!");
                modelAndView.setViewName("redirect:/login.jsp");
            }
        } else {
            modelAndView.addObject("msg", "Wrong verify code!");
            modelAndView.setViewName("redirect:/login.jsp");
        }
        modelAndView.addObject(model);
        return modelAndView;
    }

    @RequestMapping("/logout")
    public ModelAndView logout() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/login.jsp");
        Subject currentUser = SecurityUtils.getSubject();
        if (currentUser.isAuthenticated()) {
            currentUser.logout();
        }
        return modelAndView;
    }
}
