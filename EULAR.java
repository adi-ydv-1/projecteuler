
package q1;

import java.util.Scanner;
public class EULAR {

   
    public static void main(String[] args) 
    {
        int i,sum=0;
        Scanner sc=new Scanner(System.in);
        for(i=1;i<1000;i++)
        {
            if(i%3==0||i%5==0)
                sum=sum+i;
        }     
    
    System.out.println("sum of the multiples of 3 or 5 " + sum);
    
    }   
}
