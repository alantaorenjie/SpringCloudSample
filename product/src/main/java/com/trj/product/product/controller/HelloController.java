package com.trj.product.product.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TRJ
 * @date 2019/10/29
 * Description:
 */
@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        log.info("调用HelloController index 方法");
        return "hello "+name+"，this is product messge";
    }
}
