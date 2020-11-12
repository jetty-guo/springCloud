package com.jbs.spring.cloud.factory;

import com.jbs.spring.cloud.api.StudentRemoteService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class StudentRemoteFallBackFactory implements FallbackFactory<StudentRemoteService> {
    @Override
    public StudentRemoteService create(Throwable throwable) {
        return param -> "timeout "+throwable.getMessage()+"exception:";
    }
}
