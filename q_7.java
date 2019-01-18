
package Q7;
public class prime
{
      public static void main(String args[])
	    {
		   int count=0;
             for(int i=2; ;i++)
             {
            	 if(prime(i)==(int)(Math.sqrt(i)+1)) 
            		 count++;
            	 if(count==10001) {
            		 System.out.println(i);
            		break; 
            	 }
            }
  }
	    
	  static int prime(int i)
	  {
		  int j=0;
		  for(j=2;j<=Math.sqrt(i);j++)
		  {
			  if(i%j==0) {
			  break;
			  }
		  }
		   return j;
		  
	  }
}
