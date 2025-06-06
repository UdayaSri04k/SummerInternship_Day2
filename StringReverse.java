// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class StringReverse {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        System.out.println("Reversed string");
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            System.out.print(c);
        }
        
    }
}