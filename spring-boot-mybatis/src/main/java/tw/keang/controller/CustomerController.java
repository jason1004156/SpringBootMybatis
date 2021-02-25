package tw.keang.controller;

import javax.annotation.Resource;
import javax.print.DocFlavor.INPUT_STREAM;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import tw.keang.domain.Customer;
import tw.keang.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Resource
	private CustomerService customerService;
	
	//跳轉至input頁面
	@RequestMapping("/input")
	public String input(){
		return "input";
	}
	/*
	 * 保存方法
	 */
	@RequestMapping("/save")
	public String save(Customer customer){
		customerService.save(customer);
		
		return "succ";
	}
}
