import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class CoinsTriangles {
	
	public static int triangle(int x)
	{
		int h=0;
		int c=1;
		while(x>0)
		{
			x-=c;
			c++;
			if(x>=0)
			h++;
			
		}
		return h;
		
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
		int houses =100;
		for(int i =0 ; i<t;i++)
		{
			int x = inputStream.nextInt();
			System.out.println(triangle(x));
			
		}
		
			
	}

}