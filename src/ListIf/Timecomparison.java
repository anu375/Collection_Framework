package ListIf;

import java.util.LinkedList;

public class Timecomparison {

	public static void main(String[] args) {
	LinkedList<Laptop> list = new LinkedList<>();
	for(int i=1;i<=1000000;i++) {
		list.add(new Laptop(i,"a"+i,100.0+i,new int[] {12,34,56},"ab"+i));
	}
	long startingtime = System.nanoTime();
	list.remove(9);
	long endtime = System.nanoTime();
	long total_time = endtime - startingtime;
	System.out.println(total_time);
	}
}

class Laptop{
	int id;
	String name;
	double price;
	int[] servicing;
	String model;
	
	public Laptop(int id,String name,double price,int[] servicing,String model) {
		this.id = id;
		this.name = name;
		this.price =price;
		this.servicing = servicing;
		this.model = model;
	}
}