# 镜像仓库的搭建
https://www.cnblogs.com/Tempted/p/7768694.html

# 制作镜像
## 一、dockerfile 做镜像
1. docker运行springboot项目
1. 将打包好的jar放到当目录
1. 修改Dockerfile里的jar文件名
1. 修改start.cmd开放的端口，容器端口与本机的端口映射
1. 运行start.cmd，看效果

docker build -t spring-enruka-server:v1.0 .

## 二、pom.xml镜像


## 命令
https://www.runoob.com/docker/docker-command-manual.html