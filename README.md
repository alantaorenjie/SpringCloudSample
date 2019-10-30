## Spring Cloud微服务实现

|     模块     | 功能描述 |
| :----------: | :------: |
| eurekaserver | 注册中心 |
|   product    |  生产者  |
|   consumer   |  消费者  |



### 熔断器Dashboard

```xml
		<!--熔断器 Dashboard springboot 2.0-->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-hystrix-dashboard</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
```

- 访问ip:port/contextPath/hystrix

- 输入ip:port/contextPath/actuator/hystrix.stream 上下都显示loading 就说明连接上了

  

