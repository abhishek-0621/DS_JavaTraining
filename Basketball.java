
public class Basketball {

	public static void main(String[] args) {
		Player p1= new Player();
		Player p2=new Player();
		p1.setPlayerDetails("Jordan", 23, 78.97);
		p2.setPlayerDetails("Lebron", 6, 39.76);
		p1.shotProbabilty();
		p2.shotProbabilty();
		p1.printPlayer();
		p2.printPlayer();
	}

}

class Player
{
	String name;
	int jerseyNumber;
	double accuracy;
	
	void setPlayerDetails(String n, int jN, double acc)
	{
		name=n;
		jerseyNumber=jN;
		accuracy=acc;
	}
	double shotProbabilty()
	{
		if(accuracy>=50.0f)
		{
			System.out.println("high probablity he'll make the shot");
		}
		else
			System.out.println("low probablity he'll make the shot");
		return (accuracy/100f);
	}
	void printPlayer()
	{
		System.out.println("Name"+name);
		System.out.println("J No."+jerseyNumber);
		System.out.println("Accuracy"+accuracy);
	}
	
}
