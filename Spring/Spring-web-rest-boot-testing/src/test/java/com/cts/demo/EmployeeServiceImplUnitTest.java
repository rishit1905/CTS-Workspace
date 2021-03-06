package com.cts.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.demo.dao.EmployeeRepository;
import com.cts.demo.model.Department;
import com.cts.demo.model.Employee;
import com.cts.demo.service.EmployeeService;
import com.cts.demo.service.EmployeeServiceImpl;

@RunWith(SpringRunner.class)
public class EmployeeServiceImplUnitTest {

	@TestConfiguration
	static class EmployeeServiceImplTestContextConfiguration{
		
		@Bean
		public EmployeeService employeeService() {
			return new EmployeeServiceImpl();
		}
	}
	
	@Autowired
	private EmployeeService employeeService;
	
	@MockBean
	private EmployeeRepository employeeRepository;
	
	@Before
	public void setUp() {
		Employee emp=new Employee("Jemima","Kujur",Department.DEVELOPMENT,26000,LocalDate.now(),"8765432109","jemima@gmail.com");
		
		Mockito.when(employeeRepository.findByMobileNumber(emp.getMobileNumber())).thenReturn(emp);
	}
	
	@Test
	public void whenValidMobileNumber_thenEmployeeShouldBeFound() {
		String mno="8765432109";
		Employee found=employeeService.findByMobileNumber(mno);
		assertThat(found.getMobileNumber()).isEqualTo(mno);
		
	}
	
	@Test
	public void whenValidMobileNumber_thenEmployeeShouldNotBeFound() {
		String mno="124567890";
		Employee found=employeeService.findByMobileNumber(mno);
		assertThat(found).isNull();
		
	}
}
