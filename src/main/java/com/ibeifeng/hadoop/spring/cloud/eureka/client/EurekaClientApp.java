package com.ibeifeng.hadoop.spring.cloud.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * SpringCloudConfigClient
 *	
 * @Description 配置文件服务器客户端代码
 * @author yanglin
 * @version 1.0,2017年3月23日
 * @see
 * @since
 */
@EnableEurekaClient //声明为服务提供者
@SpringBootApplication
public class EurekaClientApp {
    
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApp.class, args);
    }
}
