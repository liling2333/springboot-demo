package com.liling.springbootdemo.handler;

import com.liling.springbootdemo.entity.Result;
import com.liling.springbootdemo.enums.PersonEnum;
import com.liling.springbootdemo.exception.PersonException;
import com.liling.springbootdemo.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        logger.info("拦截controller异常开始");
        if(e instanceof PersonException){
            PersonException personException = (PersonException) e;
                return ResultUtil.error(personException.getCode(), personException.getMessage());
        }else{
            return ResultUtil.error(-1, "未知错误");
        }
    }

}
