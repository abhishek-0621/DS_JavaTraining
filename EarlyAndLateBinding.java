
public class EarlyAndLateBinding 
{
	public static void main(String[] args) 
	{
		Engineer engineer=new Engineer();
		SoftwareEngineer softwareEngineer=new SoftwareEngineer();
		FrontEndDeveloper frontEndDeveloper=new FrontEndDeveloper();
		engineer.develop();
		softwareEngineer.develop();
		frontEndDeveloper.develop();
		
		engineer=softwareEngineer;
		engineer.develop();
		engineer=frontEndDeveloper;
		engineer.develop();
	}

}
class Engineer
{
	void develop() 
	{
		System.out.println("Engineer will develop the project.");
	}
}

class  SoftwareEngineer extends Engineer
{
	void develop() 
	{
		System.out.println("Software Engineer will develop the software.");
	}
}

class FrontEndDeveloper extends SoftwareEngineer
{
	void develop() 
	{
		System.out.println("Front End Developer will develop the Front end of the software.");
	}
}