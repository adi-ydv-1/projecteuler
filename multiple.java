
package Q5;

import java.util.Scanner;
public class multiple 
{
    public static void main(String args[])
    {
        int i,j,m=0;boolean f=false;
        Scanner sc=new Scanner(System.in);
        for(i=1;i<99999999999999999l;i++)
        {
          for(j=1;j<=20;j++) 
          {
              if(i%j!=0)
              {
                  f=true;
                  break;
              }             
          }
            if(f==false)
            {
                m=i;
                break;
            }
            f=false;
            
            
            
        }
        System.out.println("largest multiple "+m);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
