public class FinalTest {

public static void main(String[] args) {
	 f1car f=new f1car();
	 f.showSpeedlimit();
 }
}
class f1{
	
}
class f1car extends f1{
	final double speedlimit=300.0f;
	final void showSpeedlimit()
	{
		System.out.println("Speed limit is: " +speedlimit);
	}
}
