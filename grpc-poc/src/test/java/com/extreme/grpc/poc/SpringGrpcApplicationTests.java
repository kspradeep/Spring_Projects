package com.extreme.grpc.poc;

import com.extreme.grpcpoc.HelloWorldClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringGrpcApplicationTests {
    @Autowired
    private HelloWorldClient helloWorldClient;

    @Test
    public void testSayHello() {
        assertThat(helloWorldClient.sayHello("Extreme", "EVM"))
                .isEqualTo("Hello Extreme EVM!");
    }
}
