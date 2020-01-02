package c.c.k.dao;

import c.c.k.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Title c.c.k.dao
 * @Copyright: Copyright 2020
 * @Description: java <br/>
 * @Created on 2020/1/2 chenck
 */
//@Mapper //也可以在启动类上加@MapperScan指定包，不用在每个Mapper上加注解
public interface UserMapper extends BaseMapper<User> {
}
