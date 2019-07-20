package c.c.k;

import c.c.k.snowflaker_2.SnowflakeIdWorker;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/20 chenck
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new SnowflakeIdWorker(1L, 1L).nextId());
    }
}
