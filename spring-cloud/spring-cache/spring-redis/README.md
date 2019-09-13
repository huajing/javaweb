## docker 启动redis
https://www.cnblogs.com/zhzhlong/p/9465670.html

docker search redis  
docker pull redis  
docker docker run -p 6379:6379 -d redis:latest redis-server  
docker exec -ti 971f55332e7e  redis-cli  

## redis 的操作
https://www.cnblogs.com/Anidot/articles/7850716.html