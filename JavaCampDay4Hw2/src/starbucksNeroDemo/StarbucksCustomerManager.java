package starbucksNeroDemo;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Veritabinina kaydedildi : " + customer.getFirstName());
		}else {
			System.err.println("Gecerli bir kisi degil!");
		}
	}

	
	
}
