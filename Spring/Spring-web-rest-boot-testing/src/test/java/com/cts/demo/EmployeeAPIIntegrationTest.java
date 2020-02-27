package com.cts.demo;


import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.cts.demo.dao.EmployeeRepository;
import com.cts.demo.model.Department;
import com.cts.demo.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes=SpringWebRestBootApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.properties")
public class EmployeeAPIIntegrationTest {

	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private EmployeeRepository repository;
	
	@Before
	public void setUp() {
		Employee emp=new Employee("Jemima","Kujur",Department.DEVELOPMENT,26000,LocalDate.now(),"8765432109","jemima@gmail.com");
		
		repository.save(emp);
	}
	
	@After
	public void tearDown() {
		repository.deleteAll();
	}
	
	@Test
	public void whenFindAll_thenReturnJsonArray() throws Exception{
		
		mvc.perform(get("/emps").contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$", hasSize(1)))
		.andExpect(jsonPath("$[0].mobileNumber", is("8765432109")));
	
	}
}
