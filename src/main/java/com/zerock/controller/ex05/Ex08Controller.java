package com.zerock.controller.ex05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zerock.controller.ex03.Customer;
import com.zerock.controller.ex03.Employee;

@Controller
@RequestMapping("ex08")
public class Ex08Controller {

	@RequestMapping("sub01")
	public String method01() {
		
		// prefix:/WEB-INF/views/
		// suffix:.jsp
		
		// full view name : /WEB-INF/views/ex08/sub01.jsp
		return "ex08/sub01";
	}
	
	@RequestMapping("sub02")
	public String method02(Model model) {
		model.addAttribute("address", "londeon");
		
		return "ex08/sub01";
	}
	
	@RequestMapping("sub03")
	public String method03(Model model) {
		model.addAttribute("myName", "jimin");
		model.addAttribute("myAge", 10);
		
		return "ex08/sub03";
	}
	@RequestMapping("sub04")
	public void method04(Model model) {
		
		model.addAttribute("foods", new String[] {"apple", "milk", "coffee"});
		
	}
	
	@RequestMapping("sub05")
	public void method05(Model model) {
		model.addAttribute("heroList", new String[] {"a", "b", "c"});
	}
	
	@RequestMapping("sub06")
	public void method06(Model model) {
		
		Map<String, String> map = new HashMap<>();
		map.put("name", "jin");
		map.put("song", "butter");
		map.put("group", "bts");
		
		model.addAttribute("desc", map);
	}
	
	@RequestMapping("sub07")
	public void method07(Model model) {
		
		Customer cus = new Customer();
		cus.setAddress("seoul");
		cus.setAge(30);
		cus.setName("donald");
		
		model.addAttribute("customer", cus);		
		
	}
	
	@RequestMapping("sub08")
	public void method08(Model model) {	
		Employee emp = new Employee();
		//email, name, salary 세팅
		//jsp와 이 메소드를 완성해서 위에 세팅한 email, name, salary 출력되도록 해보기.
		emp.setEmail("email@gmail.com");
		emp.setName("trump");
		emp.setSalary(5000);
		
		model.addAttribute("employee", emp);
		
	}
	
	@RequestMapping("sub09")
	public String method09(Model model) {
		Employee emp = new Employee();
		emp.setEmail("korea@daum.net");
		emp.setName("sunja");
		emp.setSalary(70000);
		
	//  model.addAttribute("employee", emp); 아래 작성과 같다.
		model.addAttribute(emp); //attribute이름이 클래스의 이름으로 결정된다.(단, lowerCamelCase형식)
		
		return "ex08/sub08";
	}
	
	@RequestMapping("sub10")
	public String method10(Model model) {
		//model.addAttribute(Object)를 사용해서
		//sub07.jsp에서 고객의 정보가 출력되도록 코드를 완성
		
		Customer cus = new Customer();
		cus.setAddress("seoul");
		cus.setName("Jin");
		cus.setAge(20);
		
		model.addAttribute(cus);
		
		return "ex08/sub07";
	}
	
	@RequestMapping("sub11")
	public void method11(Model model) {
		List<String> l = new ArrayList<>();
		
		l.add("wanda");
		l.add("doctor");
		l.add("wong");
		
		model.addAttribute("arrayList",l);
	}
}





