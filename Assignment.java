import java.util.ArrayList;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		System.out.println("Do you want to enter department");
		Scanner scanner= new Scanner(System.in);
		ArrayList<DS> list=new ArrayList<DS>();
		String answer= new String();
		answer=	scanner.nextLine();
		if(answer.toLowerCase().equals(answer))
		{
			DS dep1=new DS();
			System.out.println("Enter Name of the department");
			String name = scanner.next();
			System.out.println("Enter location of the department");
			String location= scanner.next();
			dep1.setDepName(name);
			dep1.setDepLocation(location);
			list.add(dep1);	
		
		}

}
}
class DS
{
	private static int depId;
	private String depName;
	private String depLocation;
	private int noOfEmp;
	
	
	public DS(String depName, String depLocation) {
		super();
		this.depName = depName;
		this.depLocation = depLocation;
		depId=+10;
		noOfEmp=0;
	}
	public DS() {
		// TODO Auto-generated constructor stub
	}

	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getDepLocation() {
		return depLocation;
	}
	public void setDepLocation(String depLocation) {
		this.depLocation = depLocation;
	}
	public int getNoOfEmp() {
		return noOfEmp;
	}
	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}
	public static int getDepId() {
		return depId;
	}
	public static void setDepId() {
		DS.depId = 0;
	}
	
	
	
}