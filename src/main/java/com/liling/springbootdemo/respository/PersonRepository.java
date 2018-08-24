package com.liling.springbootdemo.respository;

import com.liling.springbootdemo.entity.PersonTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<PersonTest, Integer> {

    /**
     * 根据年龄查询（注意方法名的定义需满足规定）
     * @param age
     * @return
     */
    List<PersonTest> findByAge(Integer age);
}
