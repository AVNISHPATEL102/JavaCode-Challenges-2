import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;


public class PieceOfCake {
	
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
		        if(s.length()%2!=0)
		        System.out.println("NO");
		        else
		        {
		        for(int i=0;i<s.length();i++)
		        {
		            a[s.charAt(i)-'a']++;
		        }
		        for(int i=0;i<26;i++)
		        {
		            if(a[i]==s.length()/2)
		            {
		                f=1;
		                break;
		            }
		        }
		        if(f==0)
		        System.out.println("NO");
		        else
		        System.out.println("YES");
		        }
		    }
		/*for(int i = 0 ; i<t ; i++)
		{
			String x = inputStream.nextLine();
			
			x = sortString(x);
			
			ArrayList<Integer> count = new ArrayList<Integer>(); 
			
			char current = x.charAt(0);
			int len = x.length();
			String f = "" ;
			
			int r=0;
			
			for(int j =1; j < x.length() ; j++)
			{
				
				if(x.charAt(j) == current)
				{
					r++;
				}
				else
				{
					f+=current;
					current=x.charAt(j);
					r+=1;
					count.add(r);
					
					r=0;	
				}
				if(j-len == -1 && x.charAt(j)==current)
				{
					f+=x.charAt(j);
					r+=1;
					count.add(r);
				}
				if(j-len == -1 && x.charAt(j)!=current)
				{
					f+=x.charAt(j);
					r=1;
					count.add(r);
				}
			}
			
			int[] arr = new int[count.size()];
			for(int j = 0; j < count.size(); j++) {
			    arr[i] = count.get(i);
			}		
			int max=0;
			for(int j =0 ; j<arr.length;j++)
			{
				if(arr[j]>arr[max])
					{max=j;break;}
			}
			
			
			for(int j=0;j<arr.length;j++) {
				if(j!=max)
				{
					max-=arr[j];
				}
				
			}
			
			System.out.println((max==0 ? "Yes" : "No"));
		
		}*/
		
			
	}

} 