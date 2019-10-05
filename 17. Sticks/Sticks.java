import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Sticks {
	
	
	
	

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
			int x= inputStream.nextInt();
			int [] a = new int[x];
			
			for(int j =0 ; j<x ; j++) 
			{
				a[j] = inputStream.nextInt(); 
			}
			
			Arrays.sort(a);
			int h=1 , k=0,o=0;
			boolean a1=false,a2=false;
			for(int j = (x-1); j > 0 ; j-- )
			{	
				if(h==2)
				{
					if(a[j] == a[j-1])
						{a2=true;h+=1;o=a[j];}
				}
				if(h==1)
				{
					if(a[j] == a[j-1])
						{a1=true;h+=1;k=a[j];}
				}
				
			}
			
			if(a1 && a2)
			{
				System.out.println((k*o));
			}
			else
			{
				System.out.println("-1");
			}

		}
		
		
		
		
	}

}