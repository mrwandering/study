package com.tian.demoStudy.Controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tian.demoStudy.dao.User;

//@Controller
@RestController
public class TestController {
	
	@RequestMapping("/")
	@ResponseBody
	public void test() {
		System.out.println("Hello world");
		
	}
	@RequestMapping("/login")
	@ResponseBody
	public String hello() {
		return "Hello world";
	}
	
	Map<String,Object> map = new HashMap<>();
	@GetMapping("/page/user")
	public Object pageUser(@RequestParam(defaultValue="0",name ="page")Integer to,Integer from) {
		map.clear();
		map.put("from", from);
		map.put("to", to);
		return map;
	}
	
	@RequestMapping("/user")
	public Object saveUser(@RequestBody User user) {
		map.clear();
		map.put("user", user);
		return map;
	}
	
	@RequestMapping("/header")
	//在请求头处设置参数
	public Object getHeader(@RequestHeader("s") String s,Integer id) {
		map.clear();
		map.put("s", s);
		map.put("id", id);
		System.out.println("hello world");
		System.out.println("hello world22222");
		return map;
	}
	
	@GetMapping("/testRequest")
	public Object testRequest(HttpServletRequest request) {
		map.clear();
		String id = request.getParameter("id");
		map.put("id", id);
		return map;
	}
	@GetMapping("/testJson")
	public Object testJson() {
		map.clear();
		
		return new User("tian", 12, 30.00, new Date());
	}
	
	@GetMapping("/testDemo")
	public Object testDemo() {
		//map.clear();
		
		return new User("tian", 12, 30.00, new Date());
	}
	
}
