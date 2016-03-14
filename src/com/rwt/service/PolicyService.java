package com.rwt.service;

import com.rwt.beans.Customer;
import com.rwt.test.Test;

public class PolicyService {

	public Customer getDetail(String name) {
		Customer cs = Test.getDummyCustomer(name);
		return cs;
	}
}
