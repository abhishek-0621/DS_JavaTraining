import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.HashSet;

public class ObjectSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("Java","Aikansh",400,2,2100,31231);
		Book book2 = new Book("Java","Kuldeep",99,3,1100,31312);
		Book book3 = new Book("Java","Abhishek",99,3,1100,31312);
		//Book book4 = new Book("Java","Abhishek",99,3,1100,31312);
		HashSet<Book> bookShelf = new HashSet<Book>();
		bookShelf.add(book1);
		bookShelf.add(book2);
		bookShelf.add(book3);
		//bookShelf.add(book4);
		
		System.out.println("Objects created...");
		try {
			FileOutputStream fout  = new FileOutputStream("D:/Work_DSI/My Java Workspace/CollectionsProject/src/Serial.txt");
			System.out.println("File is ready");
			
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			System.out.println("Object stream is ready");
			
			System.out.println("Trying to store the object...");
			
		
			oos.writeObject(bookShelf);
		
			System.out.println("Object stored....");
			
			oos.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
