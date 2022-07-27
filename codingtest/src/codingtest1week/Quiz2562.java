package codingtest1week;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz2562 {
	private static void pp(ArrayList<Integer> lst) {
		lst.set(0, 1);
	}
	
	private static void qq(int a) {
		a = 4;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lst = new ArrayList<>();
		for(int i=0;i<9;i++) {
			int temp = sc.nextInt();
			lst.add(temp);
		}
		System.out.println(lst.get(0));
		pp(lst);
		System.out.println(lst.get(0));
		
		int b = 3;
		System.out.println(b);
		qq(b);
		System.out.println(b);
		
//		int max = Collections.max(lst);
//		System.out.println(max);
//		System.out.println(lst.indexOf(max)+1);
	}
}
