
package Q7;
public class prime
{
     public static void main(String args[])
     {
		   int count=0;
             for(int i=2; ;i++)
             {
            	 
            	 if(prime(i)==true) 
            		 count++;
            	 if(count==10001) {
            		 System.out.println(i);
            		break; 
            	 }
            }
     }
	    
	  static boolean prime(int i)
	  {
		  boolean f=true;int count=0;
		  for(int j=2;j<i;j++)
		  {
			  if(i%j==0) {
				  f=false;
			  break;
			  }
		  }
		   return f;
		  
	  }
}
