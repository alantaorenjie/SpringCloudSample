package com.trj.consumer.consumer.feign.hystrix;

import com.trj.consumer.consumer.feign.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author TRJ
 * @date 2019/10/30
 * Description:
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "调用失败回调HelloRemoteHystrix。。。。。。。。。。。。。。。。";
    }
}