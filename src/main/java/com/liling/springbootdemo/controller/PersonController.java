package com.liling.springbootdemo.controller;

import com.liling.springbootdemo.entity.PersonTest;
import com.liling.springbootdemo.respository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    /**
     * 查找所有用户
     *
     * @return
     */
    @GetMapping("/all")
    public List<PersonTest> findAll() {
        return personRepository.findAll();
    }

    /**
     * 插入用户
     * @param name
     * @param age
     * @param sex
     * @return
     */
    @PostMapping("/save")
    public PersonTest save(@RequestParam("name") String name,
                           @RequestParam("age") Integer age,
                           @RequestParam("sex") String sex) {
        PersonTest person = new PersonTest();
        person.setAge(age);
        person.setName(name);
        person.setSex(sex);
        return personRepository.save(person);
    }

    /**
     * 根据id更新用户
     * @param id
     * @param name
     * @param age
     * @param sex
     * @return
     */
//    @PostMapping("/update/{id}")
    @RequestMapping(value = "/update/{id}" ,method = {RequestMethod.POST, RequestMethod.PUT})
    public PersonTest update(@PathVariable(value = "id") Integer id,
                       @RequestParam(value = "name", defaultValue = "0") String name,
                       @RequestParam(value = "age",defaultValue = "0") Integer age,
                       @RequestParam(value = "sex",defaultValue = "0") String sex){
        PersonTest person = new PersonTest();
        person.setId(id);
        person.setAge(age);
        person.setName(name);
        person.setSex(sex);
        return personRepository.save(person);
    }

    // 根据id查询
    @GetMapping("/findOne/{id}")
    public Optional<PersonTest> findById(@PathVariable("id") Integer id){
        return personRepository.findById(id);
    }

    // 删除数据
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        personRepository.deleteById(id);
    }

    // 根据age查询
    @GetMapping("/findOne/age/{age}")
    public List<PersonTest> findByAge(@PathVariable("age") Integer age){
        return personRepository.findByAge(age);
    }
}
