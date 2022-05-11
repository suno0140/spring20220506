package com.zerock.mapper.ex02;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.zerock.domain.ex01.CustomerDto;
import com.zerock.domain.ex01.EmployeeDto;

public interface Ex02Mapper {

	@Select("SELECT CustomerName FROM Customers WHERE CustomerID = #{id}")
	String selectNameById(int id);

	@Select("SELECT FirstName FROM Employees WHERE EmployeeID = #{id}")
	String selectFirstEmployeeNameById(int id);

	@Select("SELECT CustomerName AS Name, Address, City, Country FROM Customers WHERE CustomerId = #{id}")
	CustomerDto selectCustomerInfoById(int id);

	@Select("SELECT FirstName, LastName, BirthDate FROM Employees WHERE EmployeeID = #{id} ")
	EmployeeDto getEmployeeInfoById(int id);

	@Insert("INSERT INTO Customers"  
			+ "(CustomerName, ContactName, City, Country, Address, PostalCode) "
			+ " VALUES (#{customerName}, #{contactName}, #{city}, #{country}, #{address}, #{postalCode} ) ")
	int insertCustomer(CustomerDto customer);


}
