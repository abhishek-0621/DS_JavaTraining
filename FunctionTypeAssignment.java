
public class FunctionTypeAssignment {

	public static void main(String[] args) {
		Assignment assign1= new Assignment();
		assign1.swap(5, 8);
		assign1.swap();
		int copied = assign1.copy();
		System.out.println("Copied number is "+copied);
		int copied2= assign1.copy2(10);
		System.out.println("Copied2 number is "+copied2);

	}

}

class Assignment
{
	void swap(int x, int y) 
	{
		int temp = x;
		x=y;
		y=temp;
		System.out.println("x after swapping is :"+x +"\n y after swapping is :"+y);
	}
	void swap()
	{
		int x =10; int y=111;
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("x after swapping is :"+x +"\n y after swapping is :"+y);
	}
	int copy() 
	{	
		int x=10,y=0;
		y=x;
		return y;
	}
	int copy2(int x)
	{
		int y=x;
		return(y);
	}
}
