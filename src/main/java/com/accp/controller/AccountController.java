package com.accp.controller;


import com.accp.biz.AccountBiz;
import com.accp.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class AccountController {

    @Resource
    private AccountBiz accountBiz;


    @RequestMapping(value = "/login")
    public String login(Account account, HttpSession session, HttpServletRequest req){
        Account account1=accountBiz.login(account.getCardNo(),account.getPassword());
        if (account1 != null) {
            session.setAttribute("accountSession",account1);
            return "redirect:index";
        }else{
            req.setAttribute("error","用户名或者密码错误");
            return "login";
        }

    }
    @RequestMapping(value = "/queryYuEr")
    public String queryBalance(Account account){
        Account account1=accountBiz.queryBalance(account);
        return "queryYuEr";
    }



}
