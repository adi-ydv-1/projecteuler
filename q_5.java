
package Q5;

public class multiple 
{
   public static void main(String args[])
	    {
	       for(int i=20; ;i+=2)
	       {
	    	   if(multiple(i)==1&&multiple_1(i)==0) {
	    		   System.out.println(i);
	    	       break;
	    	   }
	       }  
	    }
	static  int multiple(int i)
	{
	    int j=0;
		for(j=19;j>=3;j-=2)
		{
			if(i%j!=0) {
			break;
			}
		}
		return j;
	}
	static  int multiple_1(int i)
	{
	    int j=0;
		for(j=20;j>=2;j-=2)
		{
			if(i%j!=0) {
			break;
			}
		}
		return j;
	}
	  
}
