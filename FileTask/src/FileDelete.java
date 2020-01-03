import java.io.*;
import java.io.File;

public class FileDelete 
{

	public static void main(String[] args) 
	{
		File myFile = new File("C:\\temp\\sample.txt");
		if(myFile.delete())
		{
			System.out.println("You have successfully deleted this file!");
		}
		else
		{
			System.out.println("An error occurred. ");
			System.out.println("You have failed to delete this file.");
		}

	}

}
