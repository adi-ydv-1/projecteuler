
package Q5;

public class multiple 
{
   public static void main(String args[])
	    {
		 long j=2,i;boolean b=true;
	      while(b==true)
	       {
	    	   long m=20;j++;
	    	   while(m>=1)
	    	   {
	    		   if(b=(j%m!=0?true:false)==true)
	    			   break;
	    		   m--;
	    	   }
	       }
	       System.out.println(j);
	    }    
	    
}
