// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class PrimeOrNot {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n<=1)
        {
            isPrime = false;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime)
            System.out.print(n+"is prime");
        else
            System.out.print(n+"is not prime");
        
    }
}