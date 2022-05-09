package com.zerock.controller.ex03;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex05")
public class Ex05Controller {

	// /ex05/sub01?name=jin&age=11&address=seoul
	@RequestMapping("sub01")
	public void method01(HttpServletRequest request) {
		// 1.request 파라미터 수집/가공
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		
		Customer cus = new Customer();
		cus.setName(name);
		cus.setAge(age);
		cus.setAddress(address);
		
		System.out.println(cus);
		
		// 2. bussiness 로직 처리
		// dao.insert(cus);
		
		// 3. add attribute
		// 4. forward / redirect
		
	}
	
	//아래와 같이 작성해도 위와 같은 일을 한다. (사실 @ModelAttribute가 생략되어 있는것이다.)
	//지금은 필요한 필드를 parameter 작성된 값으로 자동으로 만들어준다 정도로 이해하자.
	@RequestMapping("sub02")
	public void method02(Customer cus) {
		System.out.println(cus);
	}
	@RequestMapping("sub03")
	public void method03(@ModelAttribute Customer cus) {
		System.out.println(cus);
	}
	
	// /ex05/sub04?cpu=intel&hdd=1024&model=apple
	@RequestMapping("sub04")
	public void method04(Computer com) {
		System.out.println(com); //Computer(cpu=intel, hdd=1024, model=apple)
	}
	
	@RequestMapping("sub05")
	public void method05(Employee emp) {
		System.out.println(emp); // Employee(name=donald, salary=1000, email=emp@gmail.com)
	}
}






