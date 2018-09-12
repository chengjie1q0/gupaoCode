package com.cj.springboot.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cj.springboot.entity.Order;

@Component
public class OrderSender {
	
	@Autowired
    private RabbitTemplate rabbitTemplate;
	
	 public void send(Order order)throws  Exception{

	        CorrelationData correlationData = new CorrelationData();
	        correlationData.setId(order.getMessageId());

	        rabbitTemplate.convertAndSend("order-exchange", //exchange
	                "order.abcd", //routingKey
	                order, //消息体内容
	                correlationData); //correlationData 消息唯一ID
	    }
	
	

}
