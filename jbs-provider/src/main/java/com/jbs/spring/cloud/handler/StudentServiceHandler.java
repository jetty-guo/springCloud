package com.jbs.spring.cloud.handler;

import com.jbs.spring.cloud.api.StudentGate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

/**
 * @author gs
 */
@RestController
public class StudentServiceHandler implements StudentGate {

	@HystrixCommand(fallbackMethod = "fallbackMethod") //表明这个方法再没有异常以及没有超时(hystrix默认1秒算超时)的情况，才返回正常的业务数据；
    @Override
    public String gate(@RequestParam("id") String id) {
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是gate:"+id);
        return "我是gate, 哈哈"+id;
    }

    public String fallbackMethod(@RequestParam("id") String id) {
        System.out.println("超时触发了异常,真的是很奇怪!");
        return "触发了异常,真的是很奇怪!";

    }
}
