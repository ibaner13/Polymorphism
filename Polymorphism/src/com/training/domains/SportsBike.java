package com.training.domains;

import com.training.ifaces.Automobile;

public class SportsBike implements Automobile {

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 600000.00;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Some Sports Bike";
	}

}
