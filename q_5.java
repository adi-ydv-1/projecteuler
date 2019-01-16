
package Q5;

public class multiple 
{
    public static void main(String args[])
    {
		 int i,j;
	       for(i=21; ;i++)
	       {
	    	   boolean f=true;
	    	   for( j=20;j>=1;j--)
	            {
	   			if(i%j!=0) 
	   			{
	   			f=false;
	   			break;
	   			}
	            }
	    	   if(f==true) {
	    		   System.out.println(i);
	    	   break;
	    	   }
	     }  
	}
	  
}
