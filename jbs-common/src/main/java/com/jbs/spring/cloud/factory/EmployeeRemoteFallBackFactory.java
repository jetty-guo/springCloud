package com.jbs.spring.cloud.factory;

import com.jbs.spring.cloud.api.EmployeeRemoteService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author gs
 */
@Component
public class EmployeeRemoteFallBackFactory implements FallbackFactory<EmployeeRemoteService> {

	@Override
	public EmployeeRemoteService create(final Throwable cause) {
		return param -> "consumer fall back,reason:"+cause.getClass().getName()+" "+cause.getMessage();
	}

}
