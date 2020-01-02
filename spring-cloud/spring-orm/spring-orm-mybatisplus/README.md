# Mybaitspls集成步骤

## 1、pom.xml添加依赖
(```)
<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-boot-starter</artifactId>
    <version>3.0.7.1</version>
</dependency>

<dependency><!--mysql驱动-->
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>
(```)

# sql
CREATE TABLE `user` (
  `id` bigint(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;
