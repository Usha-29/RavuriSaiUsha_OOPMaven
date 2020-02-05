package com.epam.gift;


public class Sweets{

	// number_of _sweets, cost_of_sweet, weight _of sweet
	int n,cost,weight;
	Sweets(int n, int cost, int weight){
		this.n=n;
		this.cost=cost;
		this.weight=weight;
	}
	
	public  String toString() {
		return "Cost: "+this.cost+" Weight: "+this.weight+" Total Number: "+this.n;
		}
}
