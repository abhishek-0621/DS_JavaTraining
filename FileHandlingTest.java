import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingTest {

	public static void main(String[] args) {
		try {
			System.out.println("-----------Trying to open first file-----------");
			FileInputStream finFileInputStream= new FileInputStream("D:/Work_DSI/My Java Workspace/FileHandlingProject/src/Notes.txt");
			System.out.println("1st File is open");
			
			byte b=(byte) finFileInputStream.read();
			
			while(b!=-1) {
				System.out.print((char) b);
				b=(byte) finFileInputStream.read();
				Thread.sleep(10);
			}

			System.out.println("---------------Trying to open 2nd file----------");
			FileInputStream finFileInputStream1= new FileInputStream("D:/Work_DSI/My Java Workspace/FileHandlingProject/src/Notes2.txt");
			System.out.println("2nd File is open");
			b=(byte) finFileInputStream1.read();
				
				while(b!=-1) {
					System.out.print((char) b);
					b=(byte) finFileInputStream1.read();
					Thread.sleep(10);	
			}
				System.out.println("\n-----------Trying to open 3rd file-------------");
				FileInputStream finFileInputStream2= new FileInputStream("D:/Work_DSI/My Java Workspace/FileHandlingProject/src/Notes3.txt");
				System.out.println("3rd File is open");
				b=(byte)finFileInputStream2.read();	
					while(b!=-1) {
						System.out.print((char) b);
						b=(byte) finFileInputStream2.read();
						Thread.sleep(10);	
				}
			System.out.println("------------Trying to close all the files----------");
			finFileInputStream.close();
			finFileInputStream1.close();
			finFileInputStream2.close();
			System.out.println("-----------All files is closed----------------");
			
		} catch (FileNotFoundException e) {
			System.out.println("Problem 1: "+e);
		}catch (IOException e) {
			System.out.println("Problem 2: "+e);
		}catch (InterruptedException e) {
			System.out.println("Problem 3: "+e);
		}

	}

}
