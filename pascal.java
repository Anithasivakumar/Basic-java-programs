import java.util.Scanner;
public class pascal
{ 
  public static void main(String[] args) 
  {
      Scanner s=new Scanner(System.in);
      int n = s.nextInt();
      int i, j,k; 
      for(i=0; i<n; i++) 
      { 
      for(j=1;j<n-i; j++) 
            { 
                System.out.print(" "); 
            } 
            for(k=0; k<=i; k++) 
            { 
            System.out.print("# "); 
            } 
            System.out.println(); 
        } 
    } 
} 