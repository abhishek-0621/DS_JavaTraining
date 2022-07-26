public class AssociationTest1 {

	Society s1 = new Society("Rohan Tapovan","SB Road",200);
	Flat flat1= new Flat("Rohan Tapovan","SB Road",200,901,"B",1150.0f,9);
	
	
}
class Society
{
	String societyName;
	String address;
	int  nOfFlats;
	public Society(String societyName, String address, int nOfFlats) {
		super();
		this.societyName = societyName;
		this.address = address;
		this.nOfFlats = nOfFlats;
	}
	void printSociety()
	{
		System.out.println("------Society Info------");
		System.out.println("Society name    : "+societyName);
		System.out.println("Society Address : "+address);
		System.out.println("Total Flats     : "+nOfFlats);
		System.out.println("----------------------");
	}
	
}
class Flat extends Society
{
	int flatNo;
	String wing;
	float flatArea;
	int floor;
	
	
	public Flat(String societyName, String address, int nOfFlats, int flatNo, String wing, float flatArea, int floor) {
		super(societyName, address, nOfFlats);
		this.flatNo = flatNo;
		this.wing = wing;
		this.flatArea = flatArea;
		this.floor = floor;
	}

	Room createRoom(int roomSize, Washroom w, Bed b, Furniture f) 
	{
		Room room=new Room(roomSize,w,b,f);
		return room;
	}
	
	void printFlat()
	{
		System.out.println("------Flat Info------");
		System.out.println("Flat number   : "+flatNo);
		System.out.println("Flat Wing     : "+wing);
		System.out.println("Flat floor     : "+floor);
		System.out.println("Flat Area     : "+flatArea);
		System.out.println("----------------------");
	}

}

class Room extends Flat
{
	int noOfRooms;
	float roomSize;
	String roomColor;
	public Room(String societyName, String address, int nOfFlats, int flatNo, String wing, float flatArea, int floor,
			int noOfRooms, float roomSize, String roomColor) {
		super(societyName, address, nOfFlats, flatNo, wing, flatArea, floor);
		this.noOfRooms = noOfRooms;
		this.roomSize = roomSize;
		this.roomColor = roomColor;
	}

	
}

class Washroom   //isA
{
	String type;
	Boolean solarHeater;
	public Washroom(String type, Boolean solarHeater) {
		super();
		this.type = type;
		this.solarHeater = solarHeater;
	}
	
	
}

class Bed 
{
	String bedType;
	String bedSize;
	String bedColor;
	public Bed(String bedType, String bedSize,String bedColor) {
		super();
		this.bedType = bedType;
		this.bedSize = bedSize;
		this.bedColor = bedColor;
	}
	
}

class Furniture
{
	boolean sofa;
    boolean TV;
    String ftype;
	public Furniture(boolean sofa, boolean tV, String ftype) {
		super();
		this.sofa = sofa;
		TV = tV;
		this.ftype = ftype;
	}
    

}
