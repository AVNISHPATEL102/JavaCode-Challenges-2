import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class PalindromicSubstrings {
	
	public static boolean palindrome(char[] a,char[] b)
	{
		int as=a.length;
		int bs=b.length;
		
		for(int i=0;i<as;i++)
		{
			for(int j=0;j<bs;j++)
			{
				if(b[j] == a[i])
					return true;
			}
		}
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
		inputStream.nextLine();
		for(int i =0 ; i<t;i++) 
		{
			String i1 = inputStream.nextLine();
			String i2 = inputStream.nextLine();
			
			char[] a = i1.toCharArray();
			char[] b = i2.toCharArray();
			
			System.out.println( palindrome(a,b) ? "Yes" : "No");
			
		}
		
		
		
		
	}

	

}