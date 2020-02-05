package com.epam.gift;



public class Chocolate extends Sweets{
  // All Chocolates are sweets.
	String type;
	Chocolate(int n,int cost,int weight,String type){
	super(n,cost,weight);
	this.type=type;
	}
	public  String toString() {
		return "Cost: "+this.cost+" Weight: "+this.weight+" Total Number: "+this.n;
		}
}

