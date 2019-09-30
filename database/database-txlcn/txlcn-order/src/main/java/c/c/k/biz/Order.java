package c.c.k.biz;

import com.baomidou.mybatisplus.annotation.TableName;

public class Order {
    public Order(String name){
        this.name = name;
    }

    public Order(){

    }

    private Integer id;

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