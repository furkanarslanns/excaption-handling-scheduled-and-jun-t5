package com.furkanarslan.springdemoproje3;

import dto.EmployeeDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import services.IEmployeeService;
import services.impl.EmployeeService;

@SpringBootTest(classes = Springdemoproje3Application.class)
@ComponentScan(basePackages = "com.furkanarslan.springdemoproje3.services")
class Springdemoproje3ApplicationTests {

	@MockBean
   private  IEmployeeService employeeService;


    @Test
     public void testFindEmployeeById() {
      EmployeeDTO employeeDTO =employeeService.findEmployeeById(1);

	  if(employeeDTO!=null) {
		  	System.out.println("isim :"+employeeDTO.getName());
	  }

	 }

}
