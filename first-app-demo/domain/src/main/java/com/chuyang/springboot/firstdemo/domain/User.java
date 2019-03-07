package com.chuyang.springboot.firstdemo.domain;

/**
 * <br>
 * 标题: 用户模型<br>
 * 描述: POJO类<br>
 *
 * @author gordon
 * @date 2019/03/07
 */
public class User {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
