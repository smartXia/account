package com.org.account.services;

import com.org.account.po.Accounts;

public interface LoginSessionService {
    public  String makeToken(Accounts accounts);

    public   String[] verifyToken(String token, boolean needCooike, int channel);
}
