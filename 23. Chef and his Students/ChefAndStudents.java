import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ChefAndStudents {
	
	
	
	

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
			String talk = inputStream.nextLine();
			char a = '<';
			char b = '>';
			String prof = "";
			for(int j=0 ; j<talk.length()  ; j++)
			{
				if((talk.charAt(j)) == a )
				{
					prof = prof + b;
				}
				else if((talk.charAt(j)) == b)
				{
					prof = prof + a;
				}
				else
					prof = prof + talk.charAt(j);
			}
			int x =0;
			
			for(int j=0 ; j<(prof.length()-1)  ; j++)
			{
				if(((prof.charAt(j)) == b) && ((prof.charAt(j+1)) == a) )
				{
					x = x+1;
				}
				
			}		
				
			
			System.out.println(x);
			
			
		}
		
		
		
		
	}

}