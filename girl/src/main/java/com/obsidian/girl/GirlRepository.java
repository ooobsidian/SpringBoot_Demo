package com.obsidian.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: girl
 * @description:
 * @author: ggmr
 * @create: 2018-07-30 11:11
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    //通过年龄查询
    public List<Girl> findByAge(Integer age);
}
