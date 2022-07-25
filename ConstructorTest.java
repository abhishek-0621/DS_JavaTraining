
public class ConstructorTest {

	public static void main(String[] args) {
		Ship s1= new Ship();
		Ship s2=new Ship(104,"Mumbai","Port blair ");
		Ship s3= new Ship(105, 1150.5f, "Mumbai", "Cape Town");
		System.out.println("Ship 1 "+s2);
	}

}

class Ship
{
	int shipId;
	String shipLoc;
	String shipDes;
	float shipCap;
	Ship()
	{
		System.out.println("Constructor without parameters is called");
	}
	Ship(int a, String b, String c)
	{
		shipId=a;
		shipLoc=b;
		shipDes=c;
		System.out.println("Constructor: Ship with ID: "+shipId +"going to "+shipDes +"from "+shipLoc);
		
	}
	Ship(int a,float d, String b, String c)
	{
		shipId=a;
		shipLoc=b;
		shipDes=c;
		shipCap=d;
		System.out.println("Constructor: Ship with ID: "+shipId +"going to "+shipDes +"from "+shipLoc+" with capacity"+shipCap);
		
	}
	void shipInfo(int a, String b, String c)
	{
		System.out.println("Constructor: Ship with ID: "+shipId +"going to "+shipDes +"from "+shipLoc);
	}
	@Override
	public String toString() {
		return "Ship [shipId=" + shipId + ", shipLoc=" + shipLoc + ", shipDes=" + shipDes + ", shipCap=" + shipCap
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
		
	}
		
}