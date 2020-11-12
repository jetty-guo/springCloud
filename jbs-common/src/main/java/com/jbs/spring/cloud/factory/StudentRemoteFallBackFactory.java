package com.jbs.spring.cloud.factory;
import com.jbs.spring.cloud.api.StudentServiceProxy;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class StudentRemoteFallBackFactory implements FallbackFactory<StudentServiceProxy> {
    @Override
    public StudentServiceProxy create(Throwable throwable) {
        System.out.println(throwable.getMessage());
        return param -> "timeout fasheng"+throwable.getMessage()+"exception:";
    }
}
