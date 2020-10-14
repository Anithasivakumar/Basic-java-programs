import java.util.Scanner;
public class fs1 
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n = s.nextInt();
      String a[] = new String[n];
      int j,k;
      for(int i = 0; i < n; i++)
      {
          a[i] = s.next();
      }
      for(int i=0;i<n;i++)  //i-0,"abc"    how many strings we got
      {
      char ch[]=a[i].toCharArray();     //{a,b,c}
      char chrev[]=new char[ch.length];  // empty object created to get reverse elements
      for(j=0;j<ch.length-1;j++)  //pointing ch[0] to ch[].length() {a,b,c}
      { 
      for(k=ch.length-1,j=0;k>=0;k--,j++) //pointing reverse of {a,b,c}
      {
        chrev[j]=ch[k];     //putting the {a,b,c} to chrev[] in reverse order
      }
      int n1[]=new int[ch.length];     //getting int values in array n1
      int n1rev[]=new int[chrev.length];  //getting int values in array n1rev
      for(int m=0;m<n1.length;m++)
        {
          n1[m]=(int)ch[m];                   // putting ch[int values] into seperate array n1
          n1rev[m]=(int)chrev[m];             // putting chrev[int values] into seperate array n1rev
        }
        int diff1[]=new int[n1.length-1];     //getting diff1 values in array n1
        int diff2[]=new int[n1rev.length-1];   //getting diff2 values in array n2
        for(int b=0;b<n1.length-1;b++)
        {
         diff1[b]=Math.abs(n1[b]-n1[b+1]);              // putting n1 values into seperate array diff1
         diff2[b]=Math.abs(n1rev[b]-n1rev[b+1]);        // putting n1rev values into seperate array diff2
        }
        int c=0;                                   //count the values
        for(int r=0;r<diff1.length;r++)
        {
            if(diff1[r]==diff2[r])                      //comparing differnce values and increment the count
            {
                c++;
            }
        }
        if(c==diff1.length)       //diff1=normal values,diff2=reverse values
        {
           System.out.println("FUNNY");
        }
        else
        {
            System.out.println("NOT FUNNY");
         }

        }             // INNER FOR LOOP            
        }           //OUTER FOR LOOP  
    }
}
  
    

    
    
