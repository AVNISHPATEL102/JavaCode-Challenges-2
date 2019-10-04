import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class DigitsOfNumber{
	
	public static boolean digitChanges(char[] a)
	{
		int r=0;
		char c = a[0];
		for(int i =1;i<a.length;i++)
			if(a[i] != c)
				r++;
		if(r==1 || (r==(a.length-1)) )
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
			int a = inputStream.nextInt();
			String num = String.valueOf(a);
			     
			char[] b = num.toCharArray();
			if(digitChanges( b))
			System.out.println("Yes");
			else System.out.println("No");
			 
		}
		
	}

	

}