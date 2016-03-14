package com.rwt.ws;

import javax.jws.WebService;

import com.rwt.beans.Customer;
import com.rwt.service.PolicyService;

@WebService(endpointInterface="com.rwt.ws.RetrieveService")
public class RetrieveServiceImpl implements RetrieveService {
	PolicyService ps=new PolicyService();
	
	@Override
	public Customer getDetails(String name) {
		return ps.getDetail(name);
	}

}
