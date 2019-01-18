
package Q10
public class sumprime
{
    public static void main(String args[])
    {
       long i,sum=2;
       for(i=3;i<2000000L;i+=2)
       {
    	   if(prime(i)==(int)(Math.sqrt(i)+1))
    		   sum+=i; 
       }
    	System.out.println(sum);	
    }
    public static long prime (long n)
    {
    	long i;
    	for( i=2;i<=(int)Math.sqrt(n);i++)
    	{
    		if(n%i==0) 
    			break; 
    	}
    	return i ;
    	
    }
    
} 
