package queueif;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Queue;

public class First {

	public static void main(String[] args) {
		Queue<Truck> q = new ArrayDeque<>();
		q.add(new Truck(1,12345.90));
		q.add(new Truck(9,14565.89));
		q.add(new Truck(3,23456.67));
		q.add(new Truck(2,89076.78));
		System.out.println(q.size());
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		System.out.println(q.isEmpty());
		q.clear();
		System.out.println(q);
		System.out.println(q.isEmpty());
	}
}

class Truck implements Comparable<Truck>
{
	int id;
	double price;
	
	public Truck(int id, double price) {
		this.id = id;
		this.price = price;
	}
	
	public String toString() {
		return id+" ";
	}

	@Override
	public int compareTo(Truck o) {
		return Integer.compare(o.id, this.id);
	}
}

class idComparator implements Comparator<Truck>{
	public int compare(Truck o1,Truck o2) {
		return Integer.compare(o1.id, o2.id);
	}
}