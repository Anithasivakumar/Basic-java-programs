import java.util.*;

public class sub
{
	public static void main(String[] args)
	{
	    
	    Scanner s=new Scanner(System.in);
	    String checkstr="hackerrank";
	    int input=s.nextInt();
	    String[] str=new String[input];
	    for(int i=0;i<input;i++)
	    {
	        str[i]=s.next();
	        
	    }
	    for(int i=0;i<input;i++)
	    {
			if(str[i].length() <checkstr.length()) 
			{
				System.out.println("No");
			}
			else
			{
				int k=0;
				for(int j=0;j<str[i].length()&& k<checkstr.length();j++)
				{
					if(str[i].charAt(j)==checkstr.charAt(k))
					k++;
				}
				if(k==checkstr.length())
				System.out.println("Yes");
				else
				System.out.println("No");
	    }}
	}
}