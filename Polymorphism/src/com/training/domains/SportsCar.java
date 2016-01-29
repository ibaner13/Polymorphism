package com.training.domains;

import com.training.ifaces.Automobile;

public class SportsCar implements Automobile {

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "Blue";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1000000.00;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Some Sports Car";
	}

}
