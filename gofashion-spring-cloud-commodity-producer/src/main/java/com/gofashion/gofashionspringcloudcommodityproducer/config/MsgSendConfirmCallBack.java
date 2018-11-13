package com.gofashion.gofashionspringcloudcommodityproducer.config;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;

/**
 * 消息发送到交换机确认机制
 * @author zhuzhe
 * @date 2018/5/25 15:53
 * @email 1529949535@qq.com
 */
public class MsgSendConfirmCallBack implements RabbitTemplate.ConfirmCallback {

    /**
     *  消息确认机制
     * @param correlationData 消息唯一ID
     * @param ack 消息是否消费成功
     * @param cause 消息失败原因
     */
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        System.out.println("MsgSendConfirmCallBack  , 回调id:" + correlationData);
        if (ack) {
            System.out.println("消息消费成功");
        } else {
            System.out.println("消息消费失败:" + cause+"\n重新发送");
        }
    }
}
