package setif;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class Tree_2 {

	public static void main(String[] args) {
		
//		SortedSet<Car> cars1 = new TreeSet<Car>(new PriceComparator());
//		cars1.add(new Car(1,"Honda",9.0,5678.90,new int[] {1,2,3}));
//		cars1.add(new Car(2,"Shine",9.7,87890.90,new int[] {1,2,3,4}));
//		System.out.println(cars1.first());
//		System.out.println(cars1.last());
//		System.out.println(cars1.size());
//		System.out.println(cars1);
		
		SortedSet<Car> cars = new TreeSet<Car>(new RatingComparator());
		cars.add(new Car(1,"Honda",9.0,5678.90,new int[] {1,2,3}));
		cars.add(new Car(2,"Shine",9.7,87890.90,new int[] {1,2,3,4}));
		System.out.println(cars.first());
		System.out.println(cars.last());
		System.out.println(cars.size());
		System.out.println(cars);
	}
}

class Car implements Comparable<Car>
{
	int id;
	String name;
	double rating;
	double price;
	int[] servicings;
	
	public Car(int id, String name, double rating, double price, int[] servicings) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.price = price;
		this.servicings = servicings;
	}
	public String toString() {
		return this.name;
	}
	public int hashCode() {
		return 100;
	}
	public boolean equals(Objects o) {
		return true;
	}
	public int compareTo(Car o) {
		return Double.compare(o.rating, this.rating);
	}
}

class PriceComparator implements Comparator<Car>
{

	@Override
	public int compare(Car o1, Car o2) {
		return Double.compare(o2.price,o1.price);
	}
}

class RatingComparator implements Comparator<Car>
{
	public int compare(Car o1,Car o2) {
		return Double.compare(o1.rating,o2.rating);
	}
}