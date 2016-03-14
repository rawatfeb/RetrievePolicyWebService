package com.rwt.ws;
import static com.rwt.constant.Constants.TARGET_NAMESPACE;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;

import com.rwt.beans.Customer;

@WebService
public interface RetrieveService {

	@WebMethod(operationName="sayHello")
	public Customer getDetails(@WebParam(targetNamespace=TARGET_NAMESPACE,name="name",mode=Mode.IN) String name);

}
