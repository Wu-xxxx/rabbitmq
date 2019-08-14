package cn.cims.rabbitmq.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Wu on 2019/8/14.
 */
@Component
@RabbitListener(queues = "helloRabbit")
public class Consumer {
@RabbitHandler
    public void process(String messeage){
    System.out.println("Consumer"+messeage);
}

}
