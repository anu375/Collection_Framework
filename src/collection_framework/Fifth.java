package collection_framework;

public class Fifth {

	public static void main(String[] args) {
	Isee obj = new rere();
	System.out.println(obj.seeme("ABC"));
	}
}

interface Isee<T>
{
	public T seeme(T t);
}
abstract class Now<T> implements Isee<String>
{
	abstract void run(T t);
}
class rere<Integer> extends Now<Double>
{
	public String seeme(String s) {
		return s;
	}
	public void run(Double t) {
		
	}
}