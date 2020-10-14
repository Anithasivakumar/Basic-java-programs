import java.util.Scanner;
import java.util.HashMap;
import java.math.*;
public class mindis {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n = s.nextInt();
      int a[] = new int[n];
      for(int i = 0; i < n; i++)
      {
          a[i] = s.nextInt();
      }
      int r=100000;   //maximum value given in condition
      HashMap<Integer,Integer> hash=new HashMap<>();
      int pi=0;
      int ci=0;
      for(int i=0;i<n;i++)
      {
          if(hash.containsKey(a[i]))    //checking array it contains value
          {
              ci=i;
              pi=hash.get(a[i]);
              r=Math.min((ci-pi),r);
          }
          hash.put(a[i],i);
     }
     if(r!=100000)
       {
           System.out.println(r);
        }
        else
        {
            System.out.println("-1");
         }

    }
      
}
    














// if(hash.containsKey(a[i]))    //checking array it contains value
//           {
//               int value=i-hash.get(a[i]);       //differncing the values
//               hash.put(a[i],value);
//               if(value<r)
//               {
//                   r=value;
//               }
//               if(i-hash.get(a[i])<r)
//               {
//                  r=i-hash.get(a[i]);
//                  hash.put(a[i],i);
//               }
//           }
//           else
//           {
//               hash.put(a[i],i);
//              }
//        }
//        if(r!=100000)
//        {
//            System.out.println(r);
//         }
//         else
//         {
//             System.out.println("-1");
//          }

//     }
      
// }
    
