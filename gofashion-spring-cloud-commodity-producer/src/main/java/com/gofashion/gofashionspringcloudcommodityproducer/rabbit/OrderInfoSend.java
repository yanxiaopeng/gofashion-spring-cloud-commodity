package com.gofashion.gofashionspringcloudcommodityproducer.rabbit;


import com.gofashion.gofashionspringcloudcommodityproducer.config.RabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息发送  生产者1
 * @author zhuzhe
 * @date 2018/5/25 14:28
 * @email 1529949535@qq.com
 */
@Component
public class OrderInfoSend {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 发送消息
     * @param uuid
     * @param message  消息config
     */
    public void send(String uuid,String message) {
        CorrelationData correlationId = new CorrelationData(uuid);
        rabbitTemplate.convertAndSend(RabbitConfig.SEARCH_ORDER_QUEUE, (Object) message,correlationId);
    }
}

