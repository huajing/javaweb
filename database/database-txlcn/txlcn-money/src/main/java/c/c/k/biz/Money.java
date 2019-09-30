package c.c.k.biz;

import com.baomidou.mybatisplus.annotation.TableName;

//@TableName("money")
public class Money {

    public Money(int number){
        this.number = number;
    }
    public Money(){

    }

    private Integer id;

    private Integer number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}