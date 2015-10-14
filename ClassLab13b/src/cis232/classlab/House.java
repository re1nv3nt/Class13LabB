package cis232.classlab;

public class House implements Structure {
	int bedrooms;
	int bathrooms;
	double squareFt;
	
	public House(int numBedrooms, int numBathrooms, double sqFt){
		this.bedrooms = numBedrooms;
		this.bathrooms = numBathrooms;
		this.squareFt = sqFt;
	}
	
	public double getSquareFeet(){
		return squareFt;
	}
	
	public String toString(){
		return String.format("%d bedroom %d bathroom House", bedrooms, bathrooms);
	}
}
