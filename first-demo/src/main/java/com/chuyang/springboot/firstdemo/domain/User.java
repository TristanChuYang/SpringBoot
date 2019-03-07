package com.chuyang.springboot.firstdemo.domain;

import lombok.Data;

/**
 * <br>
 * 标题: 用户模型<br>
 * 描述: POJO类<br>
 *
 * @author gordon
 * @date 2019/03/07
 */
@Data
public class User {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;
}
