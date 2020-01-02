# Mybaitspls集成7步骤

## 1、pom.xml添加依赖
    <dependency>
        <groupId>com.baomidou</groupId>
        <artifactId>mybatis-plus-boot-starter</artifactId>
        <version>3.0.7.1</version>
    </dependency>
    
    <dependency><!--mysql驱动-->
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
    </dependency>
##  2、配置文件application.yml
    spring:
      datasource:
        password: 123456
        username: root
        url: jdbc:mysql://localhost:3306/test
        driver-class-name: com.mysql.jdbc.Driver

## 3、pojo

    @Data
    @TableName("user")
    public class User {
        private Long id;
        private String name;
    
    }

## 4、mapper/dao 实现BaseMapper<User>
    @Mapper
    public interface UserMapper extends BaseMapper<User> {
    }
注意：不在启动类加MapperScan，则需要每个mapper上加@Mapper
## 5、server调用dao
    @Service
    public class UserService implements IUservice{
        @Autowired
        private UserMapper userMapper;
    
        @Override
        public void add() {
            User user = new User();
            user.setName("haha");
            userMapper.insert(user);
        }
    }

## 6、controller使用
    @RestController
    public class UserController {
        @Resource
        private IUservice uservice;
    
        @GetMapping("/get")
        public String get(){
            uservice.add();
            return "abc";
        }
    }

# 7、mysql数据库建库、建表
    CREATE TABLE `user` (
      `id` bigint(11) NOT NULL,
      `name` varchar(50) DEFAULT NULL,
      PRIMARY KEY (`id`)
    ) ENGINE=InnoDB  DEFAULT CHARSET=utf8;
