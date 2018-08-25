package com.liling.springbootdemo.exception;

import com.liling.springbootdemo.enums.PersonEnum;

public class PersonException extends RuntimeException {

    private Integer code;

    public PersonException(PersonEnum personEnum){
        super(personEnum.getMessage());
        this.code = personEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
