import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCustomTest {

	public static void main(String[] args) {
		
				System.out.println("Trying to create a file");
				FileOutputStream fout;
				try {
					fout = new FileOutputStream("D:/Work_DSI/My Java Workspace/FileHandlingProject/src/prince.txt");
				
				System.out.println("File is created");
				
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter your data :");
				String str= scan.nextLine();
				
				String string="This is the data";
				System.out.println("Got the string data..");
				
				byte byteArray []=str.getBytes();
				System.out.println("Converted the string into byte array.");
				
				fout.write(byteArray);
				System.out.println("Byte Array is written to the file");
				
				fout.close();
				System.out.println("File is closed");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
