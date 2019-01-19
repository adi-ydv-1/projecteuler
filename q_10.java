
package Q10
public class sumprime
{
   public static void main(String args[])
    {
       long i,sum=2;
       for(i=3;i<2000000L;i+=2)
       {
    	   if(prime(i)==false)
    		   sum+=i; 
       }
    	System.out.println(sum);
    	
    	
    }
    public static boolean prime (long n)
    {
    	long i;boolean f=false;
    	for( i=2;i<=(int)Math.sqrt(n);i++)
    	{
    		if(n%i==0) 
    		{
    			f=true;
    			break; 
    			
    		}
    	}
    	return f ;
    	
    }
    
}
