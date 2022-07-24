package codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lst = new ArrayList<>();
		for(int i=0;i<9;i++) {
			int temp = sc.nextInt();
			lst.add(temp);
		}
		int max = Collections.max(lst);
		System.out.println(max);
		System.out.println(lst.indexOf(max)+1);
	}
}
