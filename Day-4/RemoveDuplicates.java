package MyProjects;
import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n =sc.nextInt();
		
		List<Integer> input = new ArrayList<>();
		
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
			input.add(sc.nextInt());
		
		Set<Integer> uniqueSet = new LinkedHashSet<>(input);
		List<Integer> uniqueList = new ArrayList<>(uniqueSet);
		
		System.out.println("After removing the duplicate numbers");
		for(int num: uniqueList)
			System.out.println(num+" ");
	}

}
