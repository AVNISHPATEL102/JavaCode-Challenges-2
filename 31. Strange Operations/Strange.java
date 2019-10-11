import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Strange {
	
	public static boolean Stranging(int[] arr,int numbers,int k)
	{
		for(int i = numbers;i<arr.length;i++)
		{
			int h=0;
			for(int j = 0;j<i;j++)
				h+=arr[j];
			arr[i]=h;
		}
		
		if(arr[arr.length-1]%2 == 0)
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
		for(int j =0 ; j<t;j++) 
		{
			int numbers = inputStream.nextInt();
			int k = inputStream.nextInt();
			int[] arr= new int[numbers+k];
			
			for(int i =0;i<numbers;i++)
			{
				arr[i]=inputStream.nextInt();
			}
			
			System.out.println( Stranging(arr,numbers,k) ? "Even" : "Odd");
			
		}
		
		
		
		
	}

	

}