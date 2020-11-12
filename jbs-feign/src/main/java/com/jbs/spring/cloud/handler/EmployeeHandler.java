package com.jbs.spring.cloud.handler;

import com.jbs.spring.cloud.api.StudentRemoteService;
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

	@Autowired
	private StudentRemoteService studentRemoteService;

	@RequestMapping("/get/remote/information")
	public String getRemoteInformation(@RequestParam("param") String param) {
		return employeeRemoteService.getInfomation(param);
	}

	@RequestMapping("/get/hello")
	public String hello(@RequestParam("param") String param){
		return studentRemoteService.hello(param);
	}

}
