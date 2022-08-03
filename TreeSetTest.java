
import java.util.* ;

public class TreeSetTest {

	public static void main(String[] args) {
		ChemicalElement e1=new ChemicalElement(6, "Carbon", "C", 12);
		ChemicalElement e2=new ChemicalElement(1, "Hydrogen", "H", 1.0f);
		ChemicalElement e3=new ChemicalElement(8, "Oxygen", "O", 16);
		ChemicalElement e4=new ChemicalElement(7, "Nitrogen", "N", 14);
		ChemicalElement e5=new ChemicalElement(2, "Helium", "He", 4);
		
		TreeSet <ChemicalElement> treeSet=new TreeSet <ChemicalElement>();
		treeSet.add(e1);
		treeSet.add(e2);
		treeSet.add(e3);
		treeSet.add(e4);
		treeSet.add(e5);
		
		Iterator<ChemicalElement> i= treeSet.iterator();
		while(i.hasNext()) {
			System.out.println("Element atomic number is "+i.next());
		}
	}

}

class ChemicalElement implements Comparable<ChemicalElement>
{
	int atomicNumber;
	String atomicName;
	String atomicFormula;
	float atomicWeight;
	
	public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, float atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}

	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight;
	}

	@Override
	public int compareTo(ChemicalElement o) {
		// TODO Auto-generated method stub
		return Integer.compare(atomicNumber, o.atomicNumber);
	}
	
	
	
}