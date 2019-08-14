package cn.cims.rabbitmq.rabbitmq;

import cn.cims.rabbitmq.entity.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Wu on 2019/8/14.
 */
@Component
public class Provider {
   @Autowired
    private AmqpTemplate amqpTemplate;
   public  void send(){
       SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date date=new Date();
       String content="hello"+simpleDateFormat.format(date);
       System.out.println("Provider:"+content);
       User user=new User();
       user.setId(1);
       user.setName("王大");
       amqpTemplate.convertAndSend("helloRabbit",user.toString());
   }
}
