package pack1;

import java.util.Scanner;

public class Product {

	String name;
	int price;
	int qty;
	
	void addProduct()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter product name");
		name= s.next();
		System.out.println("enter product price");
		price=s.nextInt();
		System.out.println("enter product qty");
		qty= s.nextInt();
	}
	
	void showProduct()
	{System.out.println();
		System.out.print("  "+name);
		System.out.print("  "+price);
	
		System.out.print(" "+qty);
		
	}
}
