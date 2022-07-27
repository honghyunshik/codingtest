package codingtest2week;

import java.util.Scanner;

public class Quiz2908 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int reverse_a = reverse(a);
		int reverse_b = reverse(b);
		System.out.println(max(reverse_a,reverse_b));
		
	}
	public static int reverse(int a) {
		int reverse=0;
		while(a>0) {
			reverse*=10;
			reverse+=a%10;
			a/=10;
		}
		return reverse;
	}
	
	public static int max(int a, int b) {
		return a>b?a:b;
	}
}
