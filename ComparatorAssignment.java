import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarketShop m=new MarketShop(6, "Champions", "Aikansh");
		MarketShop m1=new MarketShop(3, "Nitro", "Kuldeep");
		MarketShop m2=new MarketShop(2, "Gold Gym", "Shweta");
		MarketShop m3=new MarketShop(9, "Multifit", "Abhishek");
		
		ArrayList<MarketShop> list=new ArrayList<MarketShop>();
		list.add(m);
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		Iterator<MarketShop> iterator=list.iterator();
		while (iterator.hasNext()) {
			System.out.println( iterator.next());
			
		}
		Collections.sort(list,new MarketShop());
		System.out.println("---------------");
		for (MarketShop marketShop : list) {
			System.out.println(marketShop);
		}
	

}
}

class MarketShop implements Comparator<MarketShop>
{
	int shopNo;
	String shopName;
	String owner;
	public MarketShop(int shopNo, String shopName, String owner) {
		super();
		this.shopNo = shopNo;
		this.shopName = shopName;
		this.owner = owner;
	}
	public MarketShop() {};
	@Override
	public int compare(MarketShop o1, MarketShop o2) {
		// TODO Auto-generated method stub
		return (Integer.compare(o1.shopNo,o2.shopNo));
	}
	@Override
	public String toString() {
		return "MarketShop [shopNo=" + shopNo + ", shopName=" + shopName + ", owner=" + owner + "]";
	}
	
	
	

}
