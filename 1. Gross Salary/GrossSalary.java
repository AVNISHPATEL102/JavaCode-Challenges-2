import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class GrossSalary {
	
	public static double salary(int s,double a ,double b)
	{
		
		return (s+(s*a)+(s*b));
	}

	public static double salary(int s,double a)
	{
		
		return (s+((s-500)*a));
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
			int a = inputStream.nextInt();
			if(a<1500)
				System.out.println(salary(a,0.1,0.9));
			else
				System.out.println(salary((a+500),0.98));
					
		}
		
			
			
			
			
			
			
		
			
		
	}

}