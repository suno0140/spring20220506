package com.zerock.service.ex02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerock.domain.ex01.CustomerDto;
import com.zerock.domain.ex01.EmployeeDto;
import com.zerock.mapper.ex02.Ex02Mapper;

@Service
public class Ex04Service {

	@Autowired
	private Ex02Mapper mapper;
	
	public String getNameById(int id) {
		String name = mapper.selectNameById(id);
								
		return name;
		
	}

	public String getEmployeeFirstNameById(int id) {
		
		return mapper.selectFirstEmployeeNameById(id);
		
	}

	public CustomerDto getCustomerInfoById(int id) {
		
		return mapper.selectCustomerInfoById(id);
	}

	public EmployeeDto getEmployeeInfoById(int id) {
		
		return mapper.getEmployeeInfoById(id);
	}

	public boolean addCustomer(CustomerDto customer) {
		int count = mapper.insertCustomer(customer);
		return count == 1;
	}

	public boolean addEmployee(EmployeeDto dto) {
		int count = mapper.insertEmployee(dto);
		
		return count == 1;
	}
	
	public List<EmployeeDto> listEmployee() {
		return mapper.listEmployee();
	}

	public List<CustomerDto> listCustomer() {
		
		return mapper.listCustomer();
	}

	public List<CustomerDto> listCustomerPage(int page, int rowPerPage) {
		
		int from = (page-1) * rowPerPage;
		
		return mapper.listCustomerPage(from, rowPerPage);
	}

	public int countCustomers() {	
		return mapper.countCustomers();
	}

}