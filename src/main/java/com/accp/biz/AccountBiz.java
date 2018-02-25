package com.accp.biz;

import com.accp.entity.Account;

public interface AccountBiz {
    Account login(String cardNo ,String password);

    Account queryBalance(Account account);

}
