import java.io.*;
public class Main
{
public static void main(String args[])
{
System.out.println(fib(5));
}
class fib(int n)
int i;
while(i<=n)
{
if(i==0)
{
System.out.println("0");
}
else if(i==1)
{
System.out.println("1");
}
else
{
System.out.println(fib(i-1)+fib(i-2));
}
}

