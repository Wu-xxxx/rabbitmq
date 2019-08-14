package cn.cims.rabbitmq;

import cn.cims.rabbitmq.rabbitmq.Provider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitmqApplication.class)
public class RabbitmqApplicationTests {
@Autowired
private Provider provider;
    @Test
    public void contextLoads() {
     for (int i=0;i<100;i++){
         provider.send();
     }
    }

}
