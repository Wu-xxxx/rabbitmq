package cn.cims.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Wu on 2019/8/14.
 */
@Configuration
public class RabbitConfiguration {
  @Bean
    public Queue queue(){
      return new Queue("helloRabbit");
  }
}
