import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class ChefAndFruits {
	
	public static int difference(int x, int y, int z)
	{
		int result=0;
		while(z>0)
		{
			if(x>y)
			{
				z-=1;y+=1;
			}
			else if(y>x)
			{
				z-=1;x+=1;
			}
			else if((x==y) && (z%2 == 0) )
			{
				x=z/2;y=z/2;z=0;
			}
			else
			{
				x=(z/2)+1;y=z/2;z=0;
			}
		}
		return Math.abs(x-y);
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
			int x = inputStream.nextInt();
			int y = inputStream.nextInt();
			int z = inputStream.nextInt();
			
			
			System.out.println(difference(x,y,z));
			
			
			
			
			
			
		}
		
			
	}

}