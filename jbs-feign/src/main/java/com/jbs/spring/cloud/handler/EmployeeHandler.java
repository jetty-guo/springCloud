package com.jbs.spring.cloud.handler;

import com.jbs.spring.cloud.api.EmployeeRemoteService;
import com.jbs.spring.cloud.api.StudentServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gs
 */
@RestController
public class EmployeeHandler implements StudentServiceProxy{
	
	@Autowired
	private EmployeeRemoteService employeeRemoteService;

	@Autowired
	private StudentServiceProxy studentRemoteService;

	@RequestMapping("/get/remote/information")
	public String getRemoteInformation(@RequestParam("param") String param) {
		return employeeRemoteService.getInfomation(param);
	}

	@RequestMapping("/get/hello")
	public String hello(@RequestParam("param") String param){
		return studentRemoteService.gate(param);
	}

	@Override
	public String gate(String id) {
		return studentRemoteService.gate(id);
	}
}
