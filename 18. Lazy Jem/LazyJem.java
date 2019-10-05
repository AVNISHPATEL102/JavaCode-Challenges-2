import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class LazyJem {
	
	public static long lazyTime(long problem , long breakTime , long time)
	{
		long result=0;
		while(problem > 0)
		{
			if(problem % 2 == 0) {
				result += ((problem/2)*time)+breakTime;
				problem = problem - (problem/2);
				time= time*2;
			}
			else
			{
				result += (((problem+1)/2)*time)+breakTime;
				problem = problem - ((problem+1)/2);
				time=time*2;
			}
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
			int problems = inputStream.nextInt();
			int breakTime = inputStream.nextInt();
			int time = inputStream.nextInt();
			long a = problems;
			long b = breakTime;
			long c = time;
			
			System.out.println(lazyTime(a,b,c));
			

		}
		
		
		
		
	}

}