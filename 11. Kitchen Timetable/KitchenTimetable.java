import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class KitchenTimetable{
	
	public static int possibleCooking(int[] a,int[]b)
	{
		int result = 0;
		int ta=0;
		int tb=0;
		for(int j =0 ; j<a.length;j++)
		{
			a[j] -=ta;
			if(b[j] <= a[j])
			{
				result++;
			}
				ta+=a[j];

		}
		return result;
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
			int a = inputStream.nextInt();
			int[]timeLimit = new int[a];
			int[] timeRequired =  new int[a];
			for(int j=0;j<a;j++) {
				timeLimit[j] = inputStream.nextInt();
			}
			for(int j=0;j<a;j++) {
				timeRequired[j] = inputStream.nextInt();
			}
			
			System.out.println(possibleCooking(timeLimit,timeRequired));
			     
			     
			 
		}
		
	}

}