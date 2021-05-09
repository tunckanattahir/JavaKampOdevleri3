package starbucksNeroDemo;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		System.out.println("Veritabina kaydedildi : " + customer.getFirstName());
		
	}
	
}
