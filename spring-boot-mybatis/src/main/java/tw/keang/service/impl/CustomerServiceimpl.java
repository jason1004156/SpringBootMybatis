package tw.keang.service.impl;

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
		customerMapper.save(customer);
	}

}
