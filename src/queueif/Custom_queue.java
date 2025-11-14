package queueif;

import java.util.Queue;
import java.util.PriorityQueue;

public class Custom_queue {

	public static void main(String[] args) {
		Queue<Bag> qu = new PriorityQueue<Bag>();
		
		qu.add(new Bag("Black",1234.67));
		qu.add(new Bag("Red",500.89));
		qu.add(new Bag("Blue",790.90));
		qu.add(new Bag("Blue",500));
		
		System.out.println(qu);
		System.out.println(qu.poll());
		System.out.println(qu.remove());
		System.out.println(qu.remove());
		System.out.println(qu.remove());
		System.out.println(qu.poll());			//--->null
		System.out.println(qu.remove());	//--> java.util.NoSuchElementException	
	}
}
class Bag implements Comparable<Bag>
{
	String colour;
	double price;
	
	public Bag(String colour, double price) {
		this.colour = colour;
		this.price = price;
	}
	public int compareTo(Bag o) {
		return Double.compare(this.price, o.price);
	}
	public String toString() {
		return price+" ";
	}
}