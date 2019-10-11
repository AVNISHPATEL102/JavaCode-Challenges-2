import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Calculator {
	
	public static double calc(double a,double b ,String s)
	{
		switch(s)
		{
		case "/": return (a/b);
		case "+": return (a+b);
		case "-": return (a-b);
		case "*": return (a*b);
		
		}
		return 0;
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
			Double i1 = (double) inputStream.nextInt();
			Double i2 = (double) inputStream.nextInt();
			String b = inputStream.next();
			
			System.out.println(calc(i1,i2,b));
		}
		
		
		
		
	}

	

}