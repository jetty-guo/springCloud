package com.jbs.spring.cloud.api;

import com.jbs.spring.cloud.factory.StudentRemoteFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author gs
 */
@FeignClient(name = "jbs-provider",fallbackFactory = StudentRemoteFallBackFactory.class)
public interface StudentServiceProxy extends StudentGate{

}
