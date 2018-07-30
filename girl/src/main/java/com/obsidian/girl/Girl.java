package com.obsidian.girl;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @program: girl
 * @description:
 * @author: obsidian
 * @create: 2018-07-29 20:36
 */
@Entity
public class Girl {
    @Id
    private Integer id;
    private String cupSize;
    private Integer age;

    public Girl() {

    }

    public Integer getId() {
        return id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
