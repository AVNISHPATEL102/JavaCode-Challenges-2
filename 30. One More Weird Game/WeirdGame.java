import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class WeirdGame {
	
	public static int Weird(int a, int b)
	{
		int result = ((a-1)*b) + ((b-1)*a);
		
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner inputStream = null;
		try {
			inputStream = new Scanner( new FileInputStream("/Users/mr.a/Desktop/eclipse/Codechef/src/stuff.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File stuff .txt was not found");
			System.exit(0);
		}
		
		int t = inputStream.nextInt();
		for(int i =0 ; i<t;i++) 
		{
			int a = inputStream.nextInt();
			int b = inputStream.nextInt();
			
			
			
			System.out.println(Weird(a,b));
			
		}
		
		
		
		
	}

	

}