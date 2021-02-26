package tw.keang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.keang.dao.CustomerMapper;
import tw.keang.domain.Customer;
import tw.keang.service.CustomerService;

@Service
@Transactional
public class CustomerServiceimpl implements CustomerService {
	//注入mapper街口對象
	@Resource
	private CustomerMapper customerMapper;

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		if(customer.getId()!=null){
			customerMapper.update(customer);
		}else{
			customerMapper.save(customer);
		}
		
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerMapper.findAll();
	}

	@Override
	public Customer findById(Integer id) {
		// TODO Auto-generated method stub
		return customerMapper.findById(id);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		customerMapper.delete(id);		
	}

}
