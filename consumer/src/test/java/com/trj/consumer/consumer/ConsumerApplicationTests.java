package com.trj.consumer.consumer;

import com.trj.consumer.consumer.feign.HelloRemote;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@Slf4j
@SpringBootTest
class ConsumerApplicationTests {

    @Autowired
    HelloRemote helloRemote;

    @Test
    void contextLoads() throws InterruptedException {
        log.info("远程调用结果：{}", helloRemote.hello("陶仁捷"));
        Thread.sleep(20000);
    }

}
