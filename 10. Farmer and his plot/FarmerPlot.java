import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class FarmerPlot{
	public static int squ(int a,int b)
	{
		int t;
		while(b!=0)
		  {
			 t = b;
			 b= a%b;
			 a=t;
		  }
		  return a*a;
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
			
			
			
			
			     System.out.println((a*b)/squ(a,b));
			     
			     
			 }
		
			
			
			
			
			
			
		
			
		
	}

}