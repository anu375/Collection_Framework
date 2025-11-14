package collection_framework;

public class Fourth {

	public static void main(String[] args) {
		List list = new A2();
	}
}

interface List<T>
{
	void add(T t);
}
abstract class ArrayList<R> implements List<Integer[]>
{
	public abstract void Add(R r,R r2);
	
	public void Add(Integer[] t) {
		
	}
}
class A2 extends ArrayList<String>
{
	public void Add(String r, String r2) {
		
	}

	@Override
	public void add(Integer[] t) {
		// TODO Auto-generated method stub
		
	}
}