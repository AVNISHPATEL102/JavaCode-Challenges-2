import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class ChefTwoStrings {
	
	public static int minDifference(String a ,String b)
	{
		int result=0;
		for(int i =0 ; i<a.length();i++)
		{
			if((a.charAt(i) != '?') && (b.charAt(i) != '?') )
				if(a.charAt(i) != b.charAt(i) )
				result+=1;
		}
		return result;
	}
	
	public static int maxDifference(String a ,String b)
	{
		int result=0;
		for(int i =0 ; i<a.length();i++)
		{
			if((a.charAt(i) != b.charAt(i)) || (a.charAt(i) == '?') || (b.charAt(i) == '?') )
				result+=1;
		}
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
		int sum =0;
		for(int i =0 ; i<t;i++)
		{
			String x = inputStream.next();
			String y = inputStream.next();
			System.out.println(x+"  " +y);
			System.out.println(minDifference(x,y) + " " + maxDifference(x,y));
			
			
		}
		
			
	}

}