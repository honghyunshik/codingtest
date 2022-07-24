package codingtest;

import java.util.Scanner;

public class Quiz8393 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int ans = 0;
		for(int i=1;i<=a;i++) {
			ans+=i;
		}
		System.out.println(ans);
	}
}
