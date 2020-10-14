import java.util.Scanner;
public class dis
{
public  static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n = s.nextInt();
String a[] = new String[n];
int i,j;
for(i=0;i<a.length-1;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
   int d=i-j;
System.out.println(d);
}
}
}
}
}
