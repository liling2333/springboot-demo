package com.liling.springbootdemo.service;

public interface PersonService {

    /**
     * 判断年龄是否符合要求
     * @param age
     * @return
     */
    public boolean checkAge(Integer age) throws Exception;
}
