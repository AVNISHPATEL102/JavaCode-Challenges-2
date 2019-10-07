import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class FindMaxValue {
	
	public static int MaxValue(int [] arr)
	{
		int len = arr.length -1;
		int result=-1;
		for(int i =0 ; i < arr.length ; i++)
		{
			if(arr[i] == len)
				result =i;
		}
		
		int [] y = new int[len];
		int j=0;
		boolean g = true;
		for(int i =0 ; i < arr.length ; i++)
		{
			if(i != result)
			{
				y[j] = arr[i];
				j++;
			}
		}
		Arrays.sort(y);
		
		
		return y[y.length-1];
			
		
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
			String g = inputStream.nextLine();
			String number[] = g.split(" ");
			int arr[] = new int[number.length];
			for(int j =0 ; j < number.length ; j++ )
			{
				arr[j] = Integer.parseInt(number[j]);
			}
			
			
			System.out.println(MaxValue(arr));
			
		}
		
		
		
		
	}

	

}