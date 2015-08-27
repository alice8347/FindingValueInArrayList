import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInArrayList {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		
		Random r = new Random();
		
		for (int index = 0; index < 10; index++) {
			int i = 1 + r.nextInt(50);
			arrayList1.add(i);
		}
		
		System.out.println("ArrayList: " + arrayList1.toString());
		System.out.print("Value to find: ");
		int i = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		int count = 0;
		for (Integer no : arrayList1) {
			if (i == no) {
				count++;
			}
		}
		
		if (count < 1) {
			System.out.println(i + " was not found");
		} else if (count == 1) {
			System.out.println(i + " was found 1 time");
		} else {
			System.out.println(i + " was found " + count + " times");
		}
	}
}
