import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class HeavenToEarth {
	
	
	
	

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
			int stairs = inputStream.nextInt();
			int elevator = inputStream.nextInt();
			
			
			double stairsTime = ( Math.sqrt(2))*stairs*length;
			double elevatorTime = elevator*length;
				
				
			
			System.out.println( ( stairsTime < elevatorTime) ? "Stairs" : "Elevator");
			
			
		}
		
		
		
		
	}

}