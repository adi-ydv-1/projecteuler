
package Q10
import java.util.Scanner;
public class sumprime
{
    public static void main(String args[])
    {
        long i,sum=0,k=2l;boolean f=false;
        Scanner sc=new Scanner(System.in);
        for(i=2;i<2000000L;i++)
        {
            while(k<i)
            {
                if(i%k==0)
                {
                    f=true;
                    break;
                }
                k++;
                
                
            }
            if(f==false)
            {
                  
                sum=sum+i;  
            }
            k=2;
            f=false;    
        }
        System.out.println("prime no below two million is "+sum);    
    }
}
