import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class SimpleStatistics {
	
	
	
	

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
			int f =0;
			
			int elements = inputStream.nextInt();
			int remove = inputStream.nextInt();
			
			int arr[] = new int[elements];
			
			for(int j= 0 ; j<elements;j++)
			{
				arr[j]=inputStream.nextInt();
			}
				
			Arrays.sort(arr);
			int x = elements-(2*remove);
			int brr[] = new int[x]; 
			int sum=0;
		
			for(int j=0 ; j<x;j++)
			{
				sum+= arr[j+remove];
			}
			
			System.out.println(((double)sum/(double)x ));
			

		}
		
		
		
		
	}

}