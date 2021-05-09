package starbucksNeroDemo;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public abstract void save(Customer customer);
	
}
