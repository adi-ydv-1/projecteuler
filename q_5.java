
package Q5;

public class multiple 
{
    public static void main(String args[])
	    {
	       for(int i=1; ;i++)
	       {
	    	   if(multiple(i)==true) {
	    		   System.out.println(i);
	    	       break;
	    	   }
	       }  
	    }
	static  boolean multiple(int i)
	{
		boolean f=true;
		for(int j=20;j>=1;j--)
		{
			if(i%j!=0) {
			f=false;
			break;
			}
		}
		return f;
	}
	  
}
