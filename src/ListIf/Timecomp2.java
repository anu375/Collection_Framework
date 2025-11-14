package ListIf;

import java.util.ArrayList;

public class Timecomp2 {

	public static void main(String[] args) {
		ArrayList<Laptop1>list = new ArrayList<>();
		
		long starttime = System.nanoTime();
		
		for(int i=1;i<=1000000;i++) {
			list.add(new Laptop1(i,"a"+i,100.0+i,new int[] {12,34,56},"ab"+i));
		}
		long endtime = System.nanoTime();
		long total_time = endtime - starttime;
		System.out.println(total_time);
	}
}

class Laptop1{
	int id;
	String name;
	double price;
	int[] servicing;
	String model;
	
	public Laptop1(int id,String name,double price,int[] servicing,String model) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.servicing = servicing;
		this.model = model;
	}
}