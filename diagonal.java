import java.util.Scanner;
import java.math.*;
public class diagonal {
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    int n = s.nextInt();
    int matrix[][]=new int[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            matrix[i][j] = s.nextInt();
        }
    }
    int leftdiagonal=0;
    int rightdiagonal=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i==j)
                leftdiagonal+= matrix[i][j];
            if(i==n-j-1)
            rightdiagonal+= matrix[i][j];
        }
    }
    System.out.println(Math.abs(leftdiagonal-rightdiagonal));
}
}

