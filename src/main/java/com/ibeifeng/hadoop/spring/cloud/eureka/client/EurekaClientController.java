package com.ibeifeng.hadoop.spring.cloud.eureka.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

private static Logger logger=LoggerFactory.getLogger(EurekaClientApp.class);
    
    @Value("${server.port}")
    private String port;
    
    @RequestMapping("/hi")
    String hello(){
        logger.info("hello eureka client "+port);
        return "hello eureka client "+port;
    }
}
