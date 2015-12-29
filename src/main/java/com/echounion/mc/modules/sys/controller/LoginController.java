package com.echounion.mc.modules.sys.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by phuang on 2015/12/28.
 */
@Controller
public class LoginController {

    /**
     * 管理登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
        Subject subject = SecurityUtils.getSubject();
        // 已登陆则 跳到首页
        if (subject.isAuthenticated()) {
            return "redirect:/";
        }
        return "login";
    }
}
