package c.c.k.entity;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @Title c.c.k.entity
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/22 chenck
 */
@TableName(value = "user")
public class User {
    public User(String name){
        this.name = name;
    }

    public User(){

    }

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
