import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;


public class ForgottenLanguage {
	
	
	
	
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
		        int x = inputStream.nextInt();
		        int y = inputStream.nextInt();
		        ArrayList<String> words = new ArrayList<String>();
		        ArrayList<String> para = new ArrayList<String>();
		        String [] a = null;
		        for(int j =0 ; j<x ; j++)
		        {
		        	String f = inputStream.next();
		        	words.add(f);
		        	a =new String[words.size()];
		        }
		        for(int j=0 ; j<y ;j++)
		        {
		        	int c = inputStream.nextInt();
		        	for(int k =0 ; k<c;k++)
		        	{
		        		String f = inputStream.next();
		        		para.add(f);
		        	}
		        	for(int k =0 ; k<x;k++)
		        	{
		        		if(para.contains(words.get(k)))
		        		{
		        			a[k]="Yes";
		        		}
		        		
		        	}
		        	
		        }
		        for(int j =0;j<x;j++) {
		        if(a[j] == "Yes")
		        System.out.print("Yes ");else System.out.print("No ");}
		        System.out.println();
		    }
	}
}