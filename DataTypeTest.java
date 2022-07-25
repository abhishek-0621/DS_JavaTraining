
public class DataTypeTest {
	public static void main(String[] args) {
		
		byte b = 127;
		System.out.println("b is "+b);
		System.out.println("min value for a byte : "+Byte.MIN_VALUE);
		System.out.println("max value for a byte : "+Byte.MAX_VALUE);
		System.out.println("size value for a byte : "+Byte.SIZE +" bits");
		
		
		short s = 228;
		System.out.println("s is "+s);
		System.out.println("min value for a short : "+Short.MIN_VALUE);
		System.out.println("max value for a short : "+Short.MAX_VALUE);
		System.out.println("size value for a short : "+Short.SIZE +" bits");
		
		int i = 123228;
		System.out.println("i is "+i);
		System.out.println("min value for a integer : "+Integer.MIN_VALUE);
		System.out.println("max value for a integer : "+Integer.MAX_VALUE);
		System.out.println("size value for a integer : "+Integer.SIZE +" bits");
		
		long l= 13223228;
		System.out.println("l is "+l);
		System.out.println("min value for a long : "+Long.MIN_VALUE);
		System.out.println("max value for a long : "+Long.MAX_VALUE);
		System.out.println("size value for a long : "+Long.SIZE +" bits");
		
		float f = 29.2f;
		System.out.println("f is "+f);
		System.out.println("min value for a float : "+Float.MIN_VALUE);
		System.out.println("max value for a float : "+Float.MAX_VALUE);
		System.out.println("size value for a float : "+Float.SIZE +" bits");
		
		double d = 298222228.99333333333;
		System.out.println("d is "+d);
		System.out.println("min value for a double : "+Double.MIN_VALUE);
		System.out.println("max value for a double : "+Double.MAX_VALUE);
		System.out.println("size value for a double : "+Double.SIZE +" bits");
		
		//char c = 'a';
		System.out.println("char min limit");
		}
}
