package com.org.account.util;

public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(1);
        result.setRet(1);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer ret, Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setRet(ret);
        result.setMsg(msg);
        return result;
    }
}
