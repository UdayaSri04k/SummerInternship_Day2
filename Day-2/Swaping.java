import java.util.*;
class Swaping{
    public static void main(String args[])
    {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        System.out.println("Before swapping");
         System.out.println("a="+a+"b="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping");
        System.out.println("a="+a+"b="+b);
    }
}