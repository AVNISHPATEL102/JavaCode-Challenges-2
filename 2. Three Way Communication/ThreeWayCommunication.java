import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ThreeWayCommunication {
	
	public static double distance(double a ,double b)
	{
		
		return (Math.sqrt((a*a)+(b*b)));
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
			int maxDistance = inputStream.nextInt();
			int x1 = inputStream.nextInt();
			int y1 = inputStream.nextInt();
			int x2 = inputStream.nextInt();
			int y2 = inputStream.nextInt();
			int x3 = inputStream.nextInt();
			int y3 = inputStream.nextInt();
			
			if( (distance(x1,y1)>maxDistance) || (distance(x2,y2)>maxDistance) || (distance(x3,y3)>maxDistance) )
			{
				System.out.println("No");
			}
			else 
				System.out.println("Yes");
					
		}
		
			
			
			
			
			
			
		
			
		
	}

}