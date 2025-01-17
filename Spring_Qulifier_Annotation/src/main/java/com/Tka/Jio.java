package com.Tka;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim {

	@Override
	public String Calling() {
		// TODO Auto-generated method stub
		return "You are calling from Jio";
	}

}
