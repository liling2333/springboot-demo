package com.liling.springbootdemo.util;

import com.liling.springbootdemo.entity.Result;

public class ResultUtil {
    public static Result success(String message, Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMessage(message);
        result.setData(object);
        return result;
    }

    public static Result error(Integer code, String message){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return  result;
    }

    public static Result success(String message){
        Result result = new Result();
        result.setCode(0);
        result.setMessage(message);
        return result;
    }
}
