package com.jbs.spring.cloud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gs
 */
public interface StudentGate {

    /**
     * gate入口
     */
    @GetMapping(value = "/student/gate")
    String gate(@RequestParam("id") String id);

}
