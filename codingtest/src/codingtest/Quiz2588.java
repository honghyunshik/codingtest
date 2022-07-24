package codingtest;

import java.util.Scanner;

public class Quiz2588 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int temp=b;
		int ans1=a*(b%10);
		
		System.out.println(ans1);
		b/=10;
		int ans2=a*(b%10);
		System.out.println(ans2);
		b/=10;
		int ans3=a*(b%10);
		System.out.println(ans3);
		System.out.println(ans1+ans2*10+ans3*100);
	}
}
