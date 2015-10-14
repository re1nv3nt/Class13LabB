package cis232.classlab;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<House> houses = new ArrayList<>();
		
		houses.add(new House(2,4,1000));
		houses.add(new House(5,2,1500));
		
		for(House h : houses){
			System.out.printf("%s with %.1f square feet%n", h, h.getSquareFeet());
		}
	}

}
