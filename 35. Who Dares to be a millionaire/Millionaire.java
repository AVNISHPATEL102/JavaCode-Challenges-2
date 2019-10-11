import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Millionaire {
	
	public static int million(String a,String b)
	{
		int t=0;
		for(int i =0;i<a.length();i++)
		{
			if(a.charAt(i) == b.charAt(i))
			{
				t++;
			}
		}
		return t;
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
			int questions = inputStream.nextInt();
			inputStream.nextLine();
			String i1 = inputStream.nextLine();
			String i2 = inputStream.nextLine();
			
			int[] points = new int[questions+1];
			for(int j =0;j<points.length;j++)
			{
				points[j]=inputStream.nextInt();
			}
			
			int index = million(i1,i2);
			System.out.println(points[index]);
		}
		
		
		
		
	}

	

}