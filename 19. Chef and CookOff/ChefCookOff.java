import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ChefCookOff {
	
	
	
	

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
			for(int j=0;j<5;j++)
			{
				int u = inputStream.nextInt();
				if(u == 1)
				{
					f+=1;
				}
			}
			switch(f)
			{
			case 0 : System.out.println("Beginner");break;
			case 1 : System.out.println("Junior Developer");break;
			case 2 : System.out.println("Middle Developer");break;
			case 3 : System.out.println("Senior Developer");break;
			case 4 : System.out.println("Hacker");break;
			case 5 : System.out.println("Avnish Patel");break;
			
			}
			

		}
		
		
		
		
	}

}