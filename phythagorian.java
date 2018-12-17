
package Q9;
public class phythagorian
{
    public static void main(String args[])
    {
        int a,b,c,product=1,k=0;
      loop1:for(a=1;a<1000;a++)
        {
            
            for(b=a+1;b<1000;b++)
            {
                
                for(c=b+1;c<1000;c++)
                {
                    
                    
                    if(a+b+c==1000&&a<b&&b<c)   
                    {
          
                        if((a*a)+(b*b)==c*c)
                        {
                            product=a*b*c;
                            
                            k++;
                            break;
                            
                        }   
                    }
                }
                    if(k==1)
                      break loop1;   
            }  
         }    
               System.out.println("product of a,b,c is "+product);       
    }
}
