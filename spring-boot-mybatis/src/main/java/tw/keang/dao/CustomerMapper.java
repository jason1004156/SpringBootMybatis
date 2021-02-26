package tw.keang.dao;


import java.util.List;

import tw.keang.domain.Customer;

public interface CustomerMapper {
	
	public void save(Customer  customer);
	
	public List<Customer> findAll();
	
	public Customer findById(Integer id);

	public void update(Customer customer);

	public void delete(Integer id);
}
