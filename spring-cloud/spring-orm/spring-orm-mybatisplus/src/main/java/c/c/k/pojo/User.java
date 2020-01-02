package c.c.k.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Title c.c.k.pojo
 * @Copyright: Copyright 2020
 * @Description: java <br/>
 * @Created on 2020/1/2 chenck
 */
@Data
@TableName("user")
public class User {
    private Long id;
    private String name;

}
