package devops.sl;

public class MyCalc {
	
	int sum(int a, int b)
	{
		return a+b;
	}

	public static void main(String[] args) {

		MyCalc calc = new MyCalc();
		Demo ob = new Demo();
		System.out.println("Sum is : "+calc.sum(20, 10));
		ob.greet();
		ob.show();
	}
}
