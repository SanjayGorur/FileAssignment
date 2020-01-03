import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) 
	{
		try
		{
			FileWriter myWriter = new FileWriter("C:\\temp\\sample.txt", true);
			myWriter.write("Hi, my name is Sanjay Gorur.");
			myWriter.write("\t");
			myWriter.write("I am 18 years old.");
			myWriter.write("\t");
			myWriter.close();
			System.out.println("Succesfully written to the file.");
		}
		
		catch(IOException e)
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
