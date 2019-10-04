import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;


public class ColourOfBalloons {
	
	 public static String sortString(String inputString) 
	    { 
	        // convert input string to char array 
	        char tempArray[] = inputString.toCharArray(); 
	          
	        // sort tempArray 
	        Arrays.sort(tempArray); 
	          
	        // return new sorted string 
	        return new String(tempArray); 
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
		inputStream.nextLine();
		 while(t-->0)
		    {
		        int a[]=new int[26];
		        int f=0;
		        String s=inputStream.next();
		        {
		        for(int i=0;i<s.length();i++)
		        {
		            a[s.charAt(i)-'a']++;
		        }
		        int max=0;
		        int index=0;
		        int len = s.length();
		        for( int j =0 ; j<a.length;j++)
		        {
		        	if(a[j] > max)
		        	{
		        		max = a[j];
		        		index=j;
		        	}
		        }
		        
		        
		        System.out.println(len-max);
		        
		        }
		    }
	}
}