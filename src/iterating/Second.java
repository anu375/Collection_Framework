package iterating;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Second {

	public static void main(String[] args) {
		List<Author> author = new ArrayList<Author>();
		for(int i=0;i<15;i++) {
			author.add(new Author("A",i));
		}
		System.out.println(author);
		Iterator<Author>itr = author.iterator();
		System.out.println(author.size());
		while(itr.hasNext()) {
			Author author1 = itr.next();
			if(author1.mobile>10) {
				itr.remove();
			}
			else
			{
				System.out.println("ineligible");
			}
		}
		System.out.println(author.size());
		System.out.println(author);
		
	}
}

class Author{
	String name;
	int mobile;
	
	public Author(String name, int mobile) {
		this.name = name;
		this.mobile = mobile;
	}
	public String toString() {
		return this.mobile+" ";
	}
}