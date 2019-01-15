
package Q9;
public class phythagorian
{
    public static void main(String args[])
	    {
	        int a,b,c,product=1;
	      loop1:for(a=1;a<1000;a++)
	        {  
	    	  for(b=a+1;b<1000;b++)
	            {       
	               c=(int)Math.sqrt(a*a+b*b); 
	                    if(a+b+c==1000&&a<b&&b<c&&(a*a)+(b*b)==c*c)   
	                    { 
	                            System.out.println("product of a,b,c is "+(a*b*c));  
	                            break loop1;     
	                    }
	            }    
	         }        
	    }
}

