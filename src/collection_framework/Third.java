package collection_framework;

public class Third {

	public static void main(String[] args) {
		Irun<String> run = new Irunimpl();
		Irun<Integer> run2 = new Irun2();
		System.out.println(run.display("Hello"));
		System.out.println(run2.display(34));
	}

}

interface Irun<T>
{
	String display(T t);
}
class Irunimpl implements Irun<String>
{
	@Override
	public String display(String str2) {
		return("This is the display method with the implementation..."+str2);
	}
}
class Irun2 implements Irun<Integer>
{
	@Override
	public String display(Integer t) {
		return t.toString();
	}
}