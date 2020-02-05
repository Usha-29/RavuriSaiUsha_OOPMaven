package com.epam.gift;

import java.util.Comparator;

public class sort  implements Comparator<Chocolate> {
		int option;
		sort(int n){
		this.option=n;
		}
		public int compare(Chocolate c1,Chocolate c2)
		{
		switch(option) {
		case 1:return c1.cost-c2.cost;
		case 2:return c1.weight-c2.weight;
		case 3:return c1.n=c2.n;

		}
		return 0;
		}
		
}

