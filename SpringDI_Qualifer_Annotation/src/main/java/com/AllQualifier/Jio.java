package com.AllQualifier;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim {

	@Override
	public String calling() {

		return " For Callig Jio is used";
	}

}
