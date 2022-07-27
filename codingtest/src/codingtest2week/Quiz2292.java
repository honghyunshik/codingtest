package codingtest2week;

import java.util.Scanner;

public class Quiz2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp=1;
		int count=1;
		while(num>temp) {
			temp+=6*count;
			count++;
		}
		System.out.println(count);
	}
}
