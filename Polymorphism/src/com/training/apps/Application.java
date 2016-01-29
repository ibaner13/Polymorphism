package com.training.apps;

import java.util.Scanner;

import com.training.domains.NewShowRoom;
//import com.training.domains.ShowRoom;
import com.training.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		//ShowRoom showRoom = new ShowRoom();
		NewShowRoom showRoom = new NewShowRoom();
		Automobile polyAuto = null; //Press control 1 for quick insertion of import statement
		Scanner sc = new Scanner(System.in);
		int key;
		do{
			System.out.println("\nPress 1 for Passenger Car, 2 for Luxury Car, 3 for Sports Car, 4 for Sports Bike, 5 to Exit");
			key=Integer.parseInt(sc.next());
			if (key>0 && key<5)
			{
				polyAuto = showRoom.getItem(key);
				showRoom.printQuote(polyAuto);	
			}
		}while(key<5);
		
		sc.close();
	}

}
