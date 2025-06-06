// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Triangle{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        System.out.println("Enter c value");
        int c=sc.nextInt();
        System.out.println("Enter h value");
        int h=sc.nextInt();
        int d=a+b+c;
        System.out.println("Perimeter is:"+d);
        double e=0.5*b*h;
        System.out.println("Area is:"+e);
       
    }
}