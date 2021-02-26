package tw.keang.controller;

import javax.annotation.Resource;
import javax.print.DocFlavor.INPUT_STREAM;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	/*
	 * 列表展示
	 */
	@RequestMapping("/list")
	public String list(Model model){
		List<Customer> list =customerService.findAll();
		model.addAttribute("list", list);
		
		return "list";
	}
	
	/*
	 * 根據id查詢
	 */
	@RequestMapping("/findById")
	public String findById(Integer id,Model model){
		Customer customer = customerService.findById(id);
		model.addAttribute("cust", customer);
		
		return "input";
	}
	
	/*
	 * 刪除
	 */
	@RequestMapping("/delete")
	public String delete(Integer id,Model model){
		customerService.delete(id);
		
		return list(model);
	}
}
