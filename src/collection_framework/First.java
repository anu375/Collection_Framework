package collection_framework;

public class First {

	public static void main(String[] args) {
		
	}
}

interface IStudent{
	double CalculateAverage();
}
class Student implements IStudent{
	String name;
	int[] marks;
	@Override
	public double CalculateAverage() {
		return 0;
	}
}