package com.training.domains;

import com.training.ifaces.Automobile;

public class LuxuryCar implements Automobile {

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 900000.00;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "BMW-7";
	}

}
