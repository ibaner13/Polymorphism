package com.training.ifaces;

/**
 * 
 * @author ibaner
 * @version 1.0
 *
 */

public interface Automobile {
	//All three methods will be public abstract, whether we specify or not.
	
	/**
	 * 
	 * @return colour of Automobile
	 */
	public String getColour();
	public abstract double getPrice();
	String getModel();
	
}
