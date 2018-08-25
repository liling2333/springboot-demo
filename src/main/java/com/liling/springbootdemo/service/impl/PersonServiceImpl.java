package com.liling.springbootdemo.service.impl;

import com.liling.springbootdemo.enums.PersonEnum;
import com.liling.springbootdemo.exception.PersonException;
import com.liling.springbootdemo.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{

    @Override
    public boolean checkAge(Integer age) throws Exception{
        if(age < 10){
            throw new PersonException(PersonEnum.PRIMARY_SCHOOL);
        }else if(age > 10 && age < 16){
            throw new PersonException(PersonEnum.MIDDLE_SCHOOL);
        }
        return true;
    }
}
