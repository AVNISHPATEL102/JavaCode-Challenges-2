import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class BuggyCalculator {
	
	public static String Bug(int a, int b)
	{
		String result = "";
		while(a != 0 || b != 0)
		{
			int x = (a%10);
			int y = (b%10);
			
			int u = x+y;
			u = u%10;
			result = result + u;
			a= a/10;
			b=b/10;
		}
			
		return new StringBuffer(result).reverse().toString();
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
			
			
			
			System.out.println(Bug(a,b));
			
		}
		
		
		
		
	}

	

}