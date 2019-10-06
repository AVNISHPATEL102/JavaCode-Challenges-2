import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class BeautifulArrays {
	
	public static boolean beautyArray(int[] a) 
	{
		int k =0;
		boolean check =true;
		for(int i =(a.length - 1) ; i>=0;i--) 
		{
			k+= i;
		}
		int arr[] =  new int [k];
		int sum=0;
		int x = a.length;
		for(int i =0 ; i < (x-1) ; i++)
		{
			for(int j=i+1 ; j<(x) ; j++)
			{
				arr[sum] =a[i]*a[j]; 
				sum++;
			}
		}
		
		
		for(int j =0 ; j<k;j++)
		{
			boolean g =false;
				for(int i =0 ; i<x;i++)
				{
					if(arr[j] == a[i] )
					{
						g=true;
					}
				}
				if(!g)
				{return false;}
		}
		
		return check;
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
			int length = inputStream.nextInt();
			int arr[] = new int[length];
			
			for(int j =0 ; j<length;j++)
			{
				arr[j] = inputStream.nextInt();
			}
			
			System.out.println((beautyArray(arr)) ? "Yes" : "No");
			
		}
		
		
		
		
	}

}