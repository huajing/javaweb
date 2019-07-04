package c.c.k.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Title chen.ce.kuan.domain
 * @Copyright: Copyright 2018
 * @Description: java <br/>
 * @Created on 2018/7/16 chenck
 */
@Entity
@Data //不用加get/set
@Table(name = "my_user")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public User(String name) {
        this.name = name;
    }
}
