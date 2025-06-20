import java.util.*;

public class Panagram
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		int max_char=26;
		boolean  arr[] = new boolean[max_char];
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				arr[ch - 'A']=true;
			}
			if(ch>='a' && ch<='z')
			{
				arr[ch - 'a']=true;
			}
		}
		boolean isPanagram = true;
		for(int i=0;i<max_char;i++)
		{
			if(!arr[i])
			{
				isPanagram=false;
				break;
			}
		}
		if (isPanagram) {
			System.out.println("The string is a Pangram.");
		} else {
			System.out.println("The string is NOT a Pangram.");
		}
	}
}







