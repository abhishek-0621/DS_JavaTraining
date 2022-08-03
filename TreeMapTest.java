import java.awt.font.TextMeasurer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarketShop1 m=new MarketShop1(6, "Champions", "Aikansh");
		MarketShop1 m1=new MarketShop1(3, "Nitro", "Kuldeep");
		MarketShop1 m2=new MarketShop1(2, "Gold Gym", "Shweta");
		MarketShop1 m3=new MarketShop1(9, "Multifit", "Abhishek");
		
		TreeMap<Integer,MarketShop1> tm=new TreeMap<Integer, MarketShop1>();
		tm.put(100, m3);
		tm.put(400, m1);
		tm.put(300, m);
		tm.put(200, m2);
	
		Set set= tm.entrySet();
		Iterator it = set.iterator();
		 
	    while(it.hasNext()) {
	      Map.Entry me = (Map.Entry)it.next();
	      System.out.print("Key is: "+me.getKey() + " & ");
	      System.out.println("Value is: "+me.getValue()); 

}
	}
}

class MarketShop1 implements Comparator<MarketShop1>
{
	int shopNo;
	String shopName;
	String owner;
	public MarketShop1(int shopNo, String shopName, String owner) {
		super();
		this.shopNo = shopNo;
		this.shopName = shopName;
		this.owner = owner;
	}
	public MarketShop1() {};
	@Override
	public int compare(MarketShop1 o1, MarketShop1 o2) {
		// TODO Auto-generated method stub
		return (Integer.compare(o1.shopNo,o2.shopNo));
	}
	@Override
	public String toString() {
		return "MarketShop1 [shopNo=" + shopNo + ", shopName=" + shopName + ", owner=" + owner + "]";
	}
	
	
	

}
