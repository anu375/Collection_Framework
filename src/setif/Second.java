package setif;

import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

public class Second {

	public static void main(String[] args) {
		Set<Bike> two_wheelers = new HashSet<Bike>();
		
		Bike bike = new Bike(1,"DUCATI",123456.90);
		Bike bike2 = new Bike(2,"SHINE",987654.890);
		Bike bike3 = new Bike(3,"SHINE",987654.890);
		
		two_wheelers.add(bike2);
		two_wheelers.add(bike);
		two_wheelers.add(bike3);
		
		System.out.println(two_wheelers);
	}
}

class Bike{
	int id;
	String name;
	double price;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setId() {
		this.id = id;
	}
	public void setName(){
		this.name = name;
	}
	public void setPrice() {
		this.price = price;
	}
	
	public Bike(int id,String name,double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int hashCode() {
		System.out.println("hashset using the .hashCode()");
		return Objects.hash(this.id,this.name,this.price);
	}
	
	public boolean equals(Object o) {
		System.out.println("using .equals()");
		Bike b = (Bike)o;
		return this.id==b.id && this.price == b.price && this.name.equals(b.name);
	}
	
	public String toString() {
		return "Bike : "+this.id;
	}
}