import java.io.*;
public class file
{
public static void main(String args[])
{
    String fname="out.txt ";
    try
    {
        PrintWriter outputstream=new PrintWriter(fname);
        outputstream.println("HII EVERYONE"); //Stores in ram first
        outputstream.close();
        System.out.println("Done");
    }
    catch(FileNotFoundException e)
    {
         e.printStackTrace();
        }
    }
}