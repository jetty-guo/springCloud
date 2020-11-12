package com.jbs.spring.cloud.api;

import com.jbs.spring.cloud.factory.StudentRemoteFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "jbs-provider")
public interface StudentRemoteService {

    @RequestMapping("/jbs/provider/hello")
    public String hello(@RequestParam("param") String param);
}
