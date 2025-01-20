package com.AllQualifier;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Sim {

	@Override
	public String calling() {

		return " For Callig Airtel is used";
	}

}
