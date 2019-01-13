
package Q7;
public class prime
{
    public static void main(String args[])
    {
	        int i,j,k=0;
	       for(i=2; ;i++)
	        {
	    	   j=2;
	            while(j<i)
	            {
	                if(i%j==0)
	                {
	                	k++;
	                	break;
	               	}
	               j++;      
	            }
	            if(i-k-1==10001)
	             {
	            	   System.out.println("10001 prime no is "+i); 
	            	   break; 
	             }
             }
    }
}
