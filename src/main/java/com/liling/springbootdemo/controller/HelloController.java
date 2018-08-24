package com.liling.springbootdemo.controller;

import com.liling.springbootdemo.properties.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@Controller
public class HelloController {

//    @Value("${name}")  //获取配置文件属性值
//    private String name;
//    @Value("${content}")
//    private String content;

    @Autowired
    private Person person;

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @GetMapping(value = "/hello") 组合注解
//    public String sayHi(@RequestParam(value = "id", required = false, defaultValue = "0")Integer id) {
////        return person.getName();
//        return "id:" + id;
//    }
    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public String sayHi(@PathVariable(value = "id", required = false)Integer id) {
//        return person.getName();
        return "id:" + id;
    }
}
