package com.gofashion.gofashionspringcloudcommodityconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
@SpringBootApplication  //boot启动
@EnableDiscoveryClient   //启动发现客户端
@EnableFeignClients     //调用
@EnableCircuitBreaker   //熔断
public class GofashionSpringCloudCommodityConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GofashionSpringCloudCommodityConsumerApplication.class, args);
    }
}
