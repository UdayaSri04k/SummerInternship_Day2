import java.util.*;
class FibnocciSeries {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int a=0,b=1;
                System.out.println("Fibonacci Series up to " + n + " terms:");

        for(int i=1;i<=n;i++)
        {
            System.out.print(a +" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
    //sc.close();
}