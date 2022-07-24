package codingtest;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz11022 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println("input  :" + input);
		ArrayList<Integer[]> lst = new ArrayList<>();
		scan.nextLine();
		for(int i=0;i<input;i++) {
			String in = scan.nextLine();
			Integer[] temp = {Integer.parseInt(in.split(" ")[0]), Integer.parseInt(in.split(" ")[1])};
			lst.add(temp);
		}
		int count=0;
		for (Integer[] a:lst) {
			count++;
			System.out.printf("Case #%d: %d + %d = %d\n",count,a[0],a[1],(a[0]+a[1]));
		}
	}
}
