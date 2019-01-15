
package Q2;

public class fibonacci
{
    public static void main(String args[])
    {
       long k=1,a=0,b=1;long sum=0,c=0;
        while(c<=4000000)
        {
            c=a+b;
            a=b;
            b=c;
            if(c%2==0)
            {
                sum=sum+c;
                        }
            
         }
        System.out.println("sum of first even 4 million terms "+sum);
    
    
    
    
    
    
    
    
    
    
}
}
