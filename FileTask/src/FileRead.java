import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileRead {

	public static void main(String[] args) 
	{
		try
		{
			FileReader newReader = new FileReader("C:\\temp\\sample.txt");
			BufferedReader finalReader = new BufferedReader(newReader);
		    String myLine; 
		    while ((myLine = finalReader.readLine()) != null)
		    {
		    	System.out.print(myLine); 
		    	System.out.println();
		    }
			newReader.close();
			System.out.println();
			System.out.println("The above information showcases the contents of your file.");
		}
		
		catch(IOException e)
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
