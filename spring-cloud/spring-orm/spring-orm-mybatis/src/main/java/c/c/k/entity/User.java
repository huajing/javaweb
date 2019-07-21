package c.c.k.entity;

/**
 * @Title c.c.k.entity
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/6/22 chenck
 */
public class User {
    public User(String name){
        this.name = name;
    }

    public User(){

    }

    private int id;

    private String name;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
