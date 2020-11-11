package com.jbs.spring.cloud.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class EmployeeHandler {
	
	@HystrixCommand(fallbackMethod = "getInfomationBackup")
	@RequestMapping("/get/infomation")
	public String getInfomation(@RequestParam("param") String param) {
		System.out.println("param:"+param);
		if("bang".equals(param)) {
			throw new RuntimeException();
		}
		
		return "remote information";
	}
	
	public String getInfomationBackup(String param) {
		return "backup message remote";
	}
	
	@RequestMapping("/get/message/from")
	public String getMessageRemote(HttpServletRequest request) {
		
		int serverPort = request.getServerPort();
		
		return "message from provider, with server port="+serverPort;
	}

}
