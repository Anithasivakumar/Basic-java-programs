import java.util.Scanner;
import java.lang.*;
class repeat {
    static int repeatstring(String st,char x)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)==x)
            c++;
        }
        int rep=n/st.length();
        c=c*rep;
        for(int i=0;i<n%st.length();i++)
        {
            if(st.charAt(i)==x)
            c++;
        }
        return c;  
    }  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(repeatstring(st,'a'));
    }

}


   















// public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         String st=sc.nextLine();
//         Long n = sc.nextLong();
//         Long c=0L;
//         for(int i=0;i<st.length();i++)
//         {
//             if(st.charAt(i)=='a')
//             c++;
//         }
//         Long rep=n/st.length();
//         long d=n%st.length();
//         c=c*rep;
//         for(int i=0;i<d;i++)
//         {
//             if(st.charAt(i)=='a')
//             c++; 
//         }
//         System.out.println(c);