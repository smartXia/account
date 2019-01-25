package com.org.account.services.impl;

import com.org.account.mapper.AccountsMapper;
import com.org.account.mapper.LoginSessionsMapper;
import com.org.account.po.Accounts;
import com.org.account.po.AccountsExample;
import com.org.account.po.LoginSessionsExample;
import com.org.account.services.LoginSessionService;
import com.org.account.util.JwtToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

@Service
public class LoginSessionImpl implements LoginSessionService {
    @Autowired
    AccountsMapper accountsMapper;
    @Autowired
    LoginSessionsMapper loginSessionsMapper;

    @Override
    public String makeToken(Accounts accounts) {
        String token = "";
        try {
            token = JwtToken.encode(accounts, "");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return token;
    }

    @Override
    public String[] verifyToken(String token, boolean needCooike, int channel) {
        String[] strArray = null;
        try {
            strArray = JwtToken.decode(token, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strArray;
    }

    public String loginSuccess(Accounts accounts, String account_type, int channel, String platform, Arrays list) {

        String accoutId = accounts.getOpenid();
        //删除旧的token
        LoginSessionsExample example = new LoginSessionsExample();
        example.or().andAccountIdEqualTo(accoutId).andChannelEqualTo(accounts.getChannel());
        loginSessionsMapper.deleteByExample(example);
        //返回channel 产生新的token
        //获取绑定信息
        //写入token进去cookie
        return null;
    }


    public static void main(String[] args) {
        Accounts accounts = new Accounts();
        accounts.setAppkey("124");
        accounts.setChannel(12);
        accounts.setOpenid("qqqqqqqqqqqq");
        LoginSessionImpl loginSession = new LoginSessionImpl();
        //加密token
        String tolken = loginSession.makeToken(accounts);
        //解密token
        String[] strArray = loginSession.verifyToken(tolken, true, accounts.getChannel());
        //输出
        System.out.println(tolken);
        System.out.println(Arrays.toString(strArray));

    }
}
