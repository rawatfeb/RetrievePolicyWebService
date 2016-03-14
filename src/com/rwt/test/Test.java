package com.rwt.test;

import com.rwt.beans.Address;
import com.rwt.beans.Customer;

public class Test {

	public static Customer getDummyCustomer(String name) {
		Customer cs = new Customer();
		cs.setFirstName("Hello "+name);
		cs.setLastName("Singhavi");
		cs.setSuffix("Mr.");

		Address address = new Address();
		address.setCity("LA");
		address.setCountry("US");
		address.setStreet("2891");
		cs.setAddress(address);

		return cs;

	}

}
