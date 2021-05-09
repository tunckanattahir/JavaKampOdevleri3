package starbucksNeroDemo;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"tahir","tunckanat",1950,"00000000000"));
	}

}
