package com.obsidian.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @program: girl
 * @description:
 * @author: obsidian
 * @create: 2018-07-30 15:35
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    // @Transactional是保证A和B能同时被录入,如有一个有异常,则两个都不会被录入
    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);
        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }
}
