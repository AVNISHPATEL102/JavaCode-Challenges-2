import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class TempleLand {
	
	public static boolean Temple(int [] arr)
	{
		if(arr.length%2 ==0 )
			return false;
		boolean condition1 = false;
		boolean condition2 = true;
		boolean condition3 = true;
		int mid = (arr.length/2) +1;
		if(arr[0] == 1  )
			condition1 = true;
		for(int i = 0 ; i < (mid-1) ; i++ )
		{
			if(arr[i] != (arr[i+1] -1))
				{condition2 = false;break;}
		}
		for(int i = (arr.length-1) ; i > mid-1 ; i--)
		{
			if(arr[i] != (arr[i-1] -1))
				{condition3 = false;break;}
		}
		
		return (condition1 && condition2 && condition3);
			
		
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
			int g = inputStream.nextInt();
			int arr[] = new int[g];
			for(int j =0 ; j < g ; j++ )
			{
				arr[j] = inputStream.nextInt();
			}
			
			
			System.out.println(Temple(arr));
			
		}
		
		
		
		
	}

	

}