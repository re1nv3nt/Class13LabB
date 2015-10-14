package cis232.classlab;

public class Barn implements Structure{
	protected int stalls;
	protected double squareFeet;
	
	
	public Barn(int stalls, double squareFeet)
	{
		this.stalls = stalls;
		this.squareFeet = squareFeet;
	}
	
	public String toString()
	{
		return String.format("%d stalled Barn", stalls);
		
		
	}
	
	
	
	@Override
	public double getSquareFeet() {
		
		return squareFeet;
	}

}
