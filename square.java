
package Q6;
public class square
{
    public static void main(String args[])
    {
       long i,sum1=0,sum2=0,sum=0;
        for(i=1;i<=100;i++)
        {
            sum1=sum1+(i*i);
            sum2=sum2+i;
            
        }
        sum2=sum2*sum2;
        sum=sum2-sum1;
        System.out.println("Difference "+sum1);
        System.out.println("Difference "+sum2);
        System.out.println("Difference "+sum);
    
    
    
    
    
    
    
}
}
