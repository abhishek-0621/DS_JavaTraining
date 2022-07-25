
public class FunctionOverloadingTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shot sObj= new Shot();
		sObj.shotBlock();
		sObj.shotBlock(93);
		sObj.shotBlock("Aikansh");
		sObj.shotBlock("Aikansh", 92);
		sObj.shotBlock(94, "Aikansh");
		sObj.shotBlock(94.2f,"Aikansh");
		
	}

}

class Shot
{
	void shotBlock()
	{
		System.out.println("Shot blocking probablity");
	}
	void shotBlock(int n)
	{
		System.out.println("Shot blocking probablity is :"+n);
	}
	void shotBlock(int n, String s)
	{
		System.out.println("Shot blocking probablity of " +s +"is "+n);
	}
	void shotBlock(String s,int n)
	{
		System.out.println("Shot blocking probablity of " +s +"is "+n);
	}
	void shotBlock(float n,String s)
	{
		System.out.println("Shot blocking probablity of " +s +"is "+n);
	}void shotBlock(String s)
	{
		System.out.println("Shot blocking probablity of " +s +"is 90%");
	}
	
	
}
