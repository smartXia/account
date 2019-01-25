package com.org.account.util;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.org.account.po.Accounts;

import java.io.UnsupportedEncodingException;
import java.util.*;

public class JwtToken {
    private static String SECRET = "1qaz2wsx";


    public static String encode(Accounts accounts, String secret) throws UnsupportedEncodingException {
        Date iatDate = new Date();
        System.out.println(iatDate);
        Calendar nowTime = Calendar.getInstance();
        nowTime.add(Calendar.MINUTE, 100);
        Date expiresDate = nowTime.getTime();
        Map<String, Object> map = new HashMap<String, Object>();
        //map中放数组'typ' => 'JWT', 'alg' => HS256
        //withClaim放map2=>
        map.put("alg", "HS256");
        map.put("type", "JWT");
        //这边需要优化但是暂时想不出来什么方法
        String arr = accounts.getOpenid() + "," + accounts.getAppkey() + "," + accounts.getChannel();
        System.out.println(arr);
        String token = JWT.create().withHeader(map)
                .withClaim("info", arr)
                .withExpiresAt(expiresDate)//过期时间
                .withIssuedAt(iatDate)//现在时间
                .sign(Algorithm.HMAC256(SECRET));//加密方式
        return token;
    }


    public static String[] decode(String token, String secret) throws Exception {
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
        DecodedJWT jwt = null;
        jwt = verifier.verify(token);
        Map<String, Claim> result = jwt.getClaims();

        jwt.getKeyId();
        jwt.getToken();
        jwt.getClaim("info").asString();
        //  return  jwt.getClaims();
        String str = result.get("info").asString();
        String[] strArray = str.split(",");
        return strArray;
    }


    public static void main(String[] args) {
        //String accounts = "1234536";
        Accounts accounts = new Accounts();
        accounts.setOpenid("accountID");
        accounts.setAppkey("appkey");
        accounts.setChannel(0);
        try {
            String token = encode(accounts, SECRET);
            System.out.print(token);
            try {
                String[] strArray = decode(token, SECRET);
                System.out.println(Arrays.toString(strArray));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
