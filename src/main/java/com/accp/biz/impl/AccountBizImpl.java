package com.accp.biz.impl;


import com.accp.biz.AccountBiz;
import com.accp.dao.AccountDao;
import com.accp.entity.Account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("accountBiz")
public class AccountBizImpl implements AccountBiz {
    @Resource
    private AccountDao accountDao;


    public Account login(String cardNo, String password) {
        return accountDao.queryAccount(new Account(cardNo,password));
    }

    public Account queryBalance(Account account) {
        return null;
    }
}
