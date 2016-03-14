package com.rwt.publisher;

import javax.xml.ws.Endpoint;

import com.rwt.ws.RetrieveServiceImpl;

public class WsPublisher {

	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/ws/retrieve", new RetrieveServiceImpl());
		System.out.println("Webservice is published !!");
	}
}
