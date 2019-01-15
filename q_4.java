
package Q4;
public class palindrome 
{
    public static void main(String args[])
    {
        int i=0,j=0,m,n,sum=0,z,max=0;
        for(i=999;i>=100;i--)
        {
            for(j=999;j>=100;j--)
            {
                m=i*j;
                while(m>0)
                {
                   z=m%10;
                   sum=(sum*10)+z;
                   m=m/10;                   
                } 
                if(sum==(i*j)&&sum>max)
                {
                    max=sum;
                } 
                sum=0;
            }
            
        }
        System.out.println("largest palindrome from product of three digit is "+max);   
}
}
