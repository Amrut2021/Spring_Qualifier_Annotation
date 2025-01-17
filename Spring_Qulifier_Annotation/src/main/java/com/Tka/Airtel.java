package com.Tka;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Sim {

	@Override
	public String Calling() {
		// TODO Auto-generated method stub
		return "You are calling from Airtel";
	}

}
