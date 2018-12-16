
package Q3;
import java.util.Scanner;
        
public class primefactor 
{
    public static void main(String args[])
    {
        
        
        long max=0;
        long i;long j=2l,x=0;boolean f=false;
        int c=0;   
        Scanner sc=new Scanner(System.in);
        
        
        
        for(i=2;i<600851475143l;i++)
        {
            
                if(i>123456780)
                    break;
            if(600851475143l%i==0l)         
            {
                while(j<i)
                {
                    if(i%j==0)
                    {
                    f=true;
                    
                    break;
                    }
                    j++;          
                }
                if(f==false&&i>max)
                {
                     
                    max=i;
                    
                                       
                } 
            }
            j=2;
            f=false;
        }
         
          
            System.out.println("Largest prime factor of "  +max);
        
            
    
    
    
    
    
    
}
}
