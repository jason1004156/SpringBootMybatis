package tw.keang.service;

import java.util.List;

import tw.keang.domain.Customer;

public interface CustomerService {
	
	public void save(Customer customer);
	
	public List<Customer> findAll();

	public Customer findById(Integer id);

	public void delete(Integer id);


}
