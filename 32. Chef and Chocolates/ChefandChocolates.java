import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ChefandChocolates {
	
	public static boolean choco(int a,int b)
	{
		int t=a*b;
		if(t%2 == 0)
			return true;
		else
			return false;
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
			int row = inputStream.nextInt();
			int column = inputStream.nextInt();
			
			System.out.println( choco(row,column) ? "Yes" : "No");
		}
		
		
		
		
	}

	

}