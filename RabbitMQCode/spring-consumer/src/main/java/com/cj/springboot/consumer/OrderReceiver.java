package com.cj.springboot.consumer;

import java.io.IOException;
import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.amqp.rabbit.annotation.*;
import com.cj.springboot.entity.Order;
import com.rabbitmq.client.Channel;

@Component
public class OrderReceiver {
	@RabbitListener(bindings = @QueueBinding(
				value = @Queue(value="order-queue" , durable="true"),
				exchange = @Exchange(name="order-exchange",durable="true",type="topic"),
				key = "order.*"
			)
	)
	
	@RabbitHandler
	public void onOrderMessage(@Payload Order order,
			@Headers Map<String, Object> headers,Channel channel) throws Exception {
		
		System.out.println("------收到消息，开始消费------");
		System.out.println("订单ID： "+ order.getId());
		
		
		Long deliveryTag = (Long) headers.get(AmqpHeaders.DELIVERY_TAG);
		
		channel.basicAck(deliveryTag, false);
	}

}
