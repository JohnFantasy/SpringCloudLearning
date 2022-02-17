# Nginx学习笔记

## Nginx常用命令

- 启动
  
  - ./nginx
  
  - ./nginx -c /usr/local/nginx/cong/nginx.conf  指定配置文件启动
  
  - ./nginx -g "/usr/local/nginx/logs/nginx.pid;" 指定nginx进程号输出文件位置启动

- 停止
  
  - ./nginx -s quit 优雅停止，待nginx处理完请求之后结束进程
  
  - ./nginx -s stop 直接停止
  
  - kill -9 [nginx进程号]  需kill主进程和子进程

- 热加载配置文件
  
  - ./nginx -s reload
  
  - kill -HUP [nginx进程号]

- 重新打开日志文件
  
  - kill -USR1 nginx进程号

## nginx配置文件详解

1. 全局块
   
   1. user 子进程所属用户（用户组）
   
   2. worker_processes 指定worker进程数
   
   3. pid 指定master进程号存储位置

2. events块
   
   1. worker_connections 单个worker进程处理的最大连接数
   
   2. 设置网络IO模型

3. http块
   
   1. server块 一个server就是一个web服务
      
      1. listen 监听端口
      
      2. location
      
      3. upstream 负载均衡

4. 邮件模块

5. 第三方块

## location匹配规则

## nginx原理

多进程机制和异步处理机制

master进程，管理进程，不负责处理业务，负责接收信号，并向worker进程发信号

worker进程：工作进程，处理具体的用户请求，数量可以设置，一般和CPU个数一致。



**nginx热部署工作原理：①master检查配置文件语法②尝试配置，打开日志文件，尝试分配新的端口③使用新的配置新建worker进程，并向旧的worker进程发送一个关闭消息④旧的工作进程继续服务，当处理完所有请求后关闭进程**

## nginx配置文件优化
