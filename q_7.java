
public class q_7 
{
	      public static void main(String args[])
		    {
			   int count=1;
	             for(int i=3; ;i+=2)
	             {
	            	 if(prime(i)==false) 
	            		 count++;
	            	 if(count==10001) {
	            		 System.out.println(i);
	            		break; 
	            	 }
	            }
		    }
		    
		  static boolean prime(int i)
		  {
			  int j=0;boolean f=false;
			  if(i%2==0)
				  return true;
			  for(j=3;j<=Math.sqrt(i);j+=2)
			  {
				  if(i%j==0) {
					  f=true;
				  break;
				  }
			  }
			   return f;
		  }  
		 
		  }

