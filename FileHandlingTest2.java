import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.IOException;

public class FileHandlingTest2 {

	public static void main(String[] args) {
		MyFileReader myFileReader=new MyFileReader("D:/Work_DSI/My Java Workspace/FileHandlingProject/src/Notes.txt");
		myFileReader.readFileData();
		MyFileReader myFileReader2=new MyFileReader("D:/Work_DSI/My Java Workspace/FileHandlingProject/src/Notes2.txt");
		myFileReader2.readFileData();
		myFileReader.closeFile();
		myFileReader2.closeFile();
		
}
}
class MyFileReader{
	FileInputStream fin;
	MyFileReader (String fileName){
		System.out.println("Trying to open the file");
		try {
			fin=new FileInputStream(fileName);
		}catch (FileNotFoundException e) {
		System.out.println("Problem 1 "+e);
		}
		System.out.println("File is open");
	}
	
	void readFileData() {
		try {
			byte b = (byte) fin.read();
			while(b!=-1) {
				System.out.print((char)b);
				b=(byte)fin.read();
				Thread.sleep(10);
				
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	void closeFile() {
		try {
			fin.close();
		} catch (IOException e) {
			
		}
	}
	
	
	
	
}
