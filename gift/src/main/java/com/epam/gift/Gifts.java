package com.epam.gift;


import java.util.*;

public class Gifts {
	String childname;
    int ts,tc;
    
	Gifts(String childname,int ts,int tc){
		this.childname=childname;
		this.ts=ts;
		this.tc=tc;
	}
	public static int Count(Chocolate[] ch,int min,int max) {
		int c=0;
		for(int i=0;i<ch.length;i++)
		if(ch[i].cost>=min && ch[i].cost<=max) c+=ch[i].n;
		return c;
		}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count of children to take NewYearGifts:");
		int n=sc.nextInt();
		 int ts,tc;
		Gifts[] gift=new Gifts[n];
		Sweets[] sw;
		Chocolate[] ch;
	    String childname;
	   
		for(int i=0;i<n;i++) {
		System.out.println("Enter the child name");
		childname=sc.next();
		
		System.out.println("Enter total number of sweets for children");
	    ts=sc.nextInt();
	    
	  
	    System.out.println("Enter total number of chocolates for children");
	    tc=sc.nextInt();
	    
	    sw=new Sweets[ts];
	    ch=new Chocolate[tc];
	    
		gift[i]=new Gifts(childname,ts,tc);
		
		int cost,weight,tw=0;
		
		System.out.println("Enter cost and weight of sweets");
		for(int j=0;j<gift[i].ts;j++) {
		cost=sc.nextInt();
		weight=sc.nextInt();
		sw[j]=new Sweets(ts,cost,weight);
		tw+=weight*ts;
		}
		
		String type;
		System.out.println("Enter cost,weight and type of chocolates");
		for(int j=0;j<gift[i].tc;j++) {
		cost=sc.nextInt();
		weight=sc.nextInt();
		type=sc.next();
		ch[j]=new Chocolate(tc,cost,weight,type);
		 tw+=weight*tc;
		}
		
		
		System.out.println("Total weight of child "+gift[i].childname+" is: "+tw);
		
		
		
		System.out.println("Sort the chocolates in a gift by one of the options.\n 1.Cost 2.Weight 3.Number of choclates");
		int option=sc.nextInt();
		Arrays.sort(ch,new sort(option));
		System.out.println("After sorting..");
		
		for(int j=0;j<tc;j++) 
		System.out.println(ch[j]);
		
		//Find candies in the gift corresponding to a predetermined range of options.
		
				System.out.println("Enter cost range ");
				int start=sc.nextInt();
				int end=sc.nextInt();
				
				System.out.println("Number of chocolates within the given range of price "+Count(ch,start,end));
		}
		
		
		sc.close();

}
	}

