package c.c.k.config;

import c.c.k.enums.MyMapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/15 15:15
 * @Version 1.0
 **/

//@Configuration
@ComponentScan("c.c.k")
@MyMapperScan("c.c.k.mapper")
public class AppConfig {

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");  //加载驱动
        String url = "jdbc:mysql://60.205.138.206:3306/mybatis";  //数据库路径
        dataSource.setUrl(url);
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        return dataSource;
    }
}
