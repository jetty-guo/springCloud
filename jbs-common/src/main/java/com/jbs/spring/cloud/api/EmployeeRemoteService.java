package com.jbs.spring.cloud.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jbs.spring.cloud.factory.EmployeeRemoteFallBackFactory;

@FeignClient(name = "JBS-PROVIDER", fallbackFactory = EmployeeRemoteFallBackFactory.class)
public interface EmployeeRemoteService {
	
	@RequestMapping("/jbs/provider/get/infomation")
	public String getInfomation(@RequestParam("param") String param);

}
