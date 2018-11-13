package com.gofashion.gofashionspringcloudcommodityproducer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = SolrAutoConfiguration.class)
@EnableDiscoveryClient
@EnableScheduling
@MapperScan(value = "com.gofashion.gofashionspringcloudcommodityproducer.dao")
public class GofashionSpringCloudCommodityProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GofashionSpringCloudCommodityProducerApplication.class, args);
    }
}
