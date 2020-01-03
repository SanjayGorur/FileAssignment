import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileSample 
{

	public static void main(String[] args) 
	{
		
		try
		{
			File file = new File("C:\\temp\\sample.txt");
			if(file.exists())
			{
				System.out.println("File already exists");
				System.out.println();
			}
			else
			{
				file.createNewFile();
				System.out.println("File is created ");
				System.out.println();
			}
			
		}
		
		catch(IOException e)
		{
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
	}

}
