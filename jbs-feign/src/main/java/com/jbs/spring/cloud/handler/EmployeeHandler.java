package com.jbs.spring.cloud.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbs.spring.cloud.api.EmployeeRemoteService;

/**
 * @author gs
 */
@RestController
public class EmployeeHandler {
	
	@Autowired
	private EmployeeRemoteService employeeRemoteService;
	
	@RequestMapping("/get/remote/information")
	public String getRemoteInformation(@RequestParam("param") String param) {
		return employeeRemoteService.getInfomation(param);
	}

}
