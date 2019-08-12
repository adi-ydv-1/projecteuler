
package Q3;       
public class primefactor 
{
 public static void main(String args[])
	    {	        
	        long i;long j=2,x=0;
	 long n=600851475143;
	 long c=Math.sqrt(n);int ans=0;
	 for(i=2;i<=c;i++)
	 {
		 if(n%i==0)
		 {
			 ans=i;
			 n=n/i;
			 i--;
		 }		 
	 }
	 System.out.println(ans);     
 }          
}
