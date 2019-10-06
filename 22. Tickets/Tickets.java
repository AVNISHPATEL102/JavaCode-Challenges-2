import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Tickets {
	
	
	
	

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
			String a = inputStream.nextLine();
			char a1= a.charAt(0);
			char a2 = a.charAt(1);
			
			if(a1 == a2)
			{
				System.out.println("No");
				System.exit(0);
			}
			boolean check = true;
			for(int j=2 ; j<a.length()  ; j++)
			{
				char b1 = a.charAt(j);
				if(j%2 == 0 )
				{
					if(b1 != a1) check=false;
				}
				else
				{
					if(b1 != a2) check=false;
				}
					
				
			}
			System.out.println(check ? "Yes" : "No");

		}
		
		
		
		
	}

}