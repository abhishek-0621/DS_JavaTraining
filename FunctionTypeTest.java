
public class FunctionTypeTest {

	public static void main(String[] args) {
		Calculator myCalci = new Calculator();
		myCalci.fun1();
		myCalci.fun2(2, 23.52f, 2444.222);
		myCalci.fun3(2, 23.23f, 299.44);
		myCalci.fun4();
	}

}

class Calculator
{
	void fun1()
	{
		System.out.println("Fun1 is doing some activity");
		System.out.println("-----------------");
	}
	void fun2(int x, float y, double z)
	{
		System.out.println("Fun2 is doing some activity");
		System.out.println("x is : "+x);
		System.out.println("y is : "+y);
		System.out.println("z is : "+z);
		System.out.println("-----------------");
	
	}
	double fun3(int x, float y, double z)
	{
		System.out.println("Fun3 is doing some activity");
		System.out.println("x is : "+x);
		System.out.println("y is : "+y);
		System.out.println("z is : "+z);
		System.out.println("-----------------");
		return x+y+6;
	}
	String fun4()
	{
		System.out.println("Fun4 is doing some activity");
		System.out.println("-----------------");
		return "hello"; 
	}
}