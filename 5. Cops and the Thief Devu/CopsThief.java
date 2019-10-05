import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CopsThief {
	
	
	
	

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
			char a[] = new char[100];
			int freeHouse = 0;

			for(int j=0;j<100;j++)
			{
				a[j
				  ] = 'e';
			}
			int m = inputStream.nextInt();
			int x = inputStream.nextInt();
			int y = inputStream.nextInt();
			
			int housesCheck = x*y;
			
			for(int j = 0 ; j<m;j++)
			{
				int currentHouse = inputStream.nextInt();
				System.out.println(currentHouse+" "+housesCheck);
				for(int k=0; k <= housesCheck ;k++)
				{
					if(currentHouse+k < 100)
						a[currentHouse+k] = 'f';
					if(currentHouse-k >= 0)
						a[currentHouse-k]='f';
				}
			}
			
			
			
			for(int j=0; j<100 ; j++)
			{
				if( a[j] == 'e' ) {
					freeHouse+=1;}
			}
			System.out.println(freeHouse);
			System.out.println(a);

		}
		
		
		
		
	}

}