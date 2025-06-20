package MyProjects;
import java.util.*;
public class SecondLargestElement {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		List<Integer> l =new ArrayList<>();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			l.add(sc.nextInt());
			
		Collections.sort(l,Collections.reverseOrder());
		if(l.size()<2)
			System.out.println("No 2nd largest number");
		else
			System.out.println(l.get(1));
	}

}
