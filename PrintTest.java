import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		try {
			fout=new FileOutputStream("D:/Work_DSI/My Java Workspace/FileHandlingProject/src/Notes.txt");
			
			System.out.println("File is ready");
			PrintStream ps=new PrintStream(fout);
			System.out.println("Print stream is ready");
			
			ps.println("Hello file1");
			ps.println("Hello file2");
			ps.println("Hello file3");
			ps.println("Hello file4");
			ps.close();
			fout.close();
		}catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
		
		}
		
	}

}
