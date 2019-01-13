
package Q3;       
public class primefactor 
{
 public static void main(String args[])
	    {	        
	        long i;long j=2,x=0;
	             
	        loop1:for(i=1000000;i>=0;i--)
	        {
	            if(600851475143l%i==0)         
	            {
	                while(j<i)
	                {
	                    if(i%j==0)                
	                    break;
	                    j++;          
	                }
	                if(j==i)
                        {
	                  System.out.println("Largest prime factor of "  +i);	
	                  break loop1;   
	                }
	            }
	            j=2;
	        }
	         

 }          
}
