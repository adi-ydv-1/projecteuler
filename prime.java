
package Q7;

import java.util.Scanner;
public class prime
{
    public static void main(String args[])
    {
        int i,j=2,k=0,m=0;boolean f=false;
        Scanner sc=new Scanner(System.in);
        for(i=2;i<123456788;i++)
        {
            while(j<i)
            {
                if(i%j==0)
                {
                 f=true;
                 break;
                 
                }
                j++;
            }
               j=2;
               if(f==false)
               {
                   k++;
                   if(k==10001)
                   {
                      m=i;
                   break;
                   
                   
                   }
                   
                }
               f=false;
        }
        System.out.println("10001 prime no is "+m);
    
    
    
    
    
    
    
}
}
