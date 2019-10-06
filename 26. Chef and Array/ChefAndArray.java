import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ChefAndArray {
	
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
			int n = inputStream.nextInt();
			int k = inputStream.nextInt();
			int h =0;
			for(int j =0 ; j<n;j++)
			{
				int p = inputStream.nextInt();
				if(p%2 == 0)
				{
					h++;
				}
			}
			
			System.out.println((k == h) ? "Yes" : "No");
			
		}
		
		
		
		
	}

}