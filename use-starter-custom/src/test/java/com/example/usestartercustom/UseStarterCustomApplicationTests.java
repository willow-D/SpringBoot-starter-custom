package com.example.usestartercustom;



import com.HelloService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class UseStarterCustomApplicationTests {

    @Autowired
    HelloService helloService;

    @Test
    void contextLoads() {
        System.out.println(helloService.sayHello());
        System.out.println(1);
    }
}
