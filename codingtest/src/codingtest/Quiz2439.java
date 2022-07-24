package codingtest;

import java.util.Scanner;

public class Quiz2439 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=a-1-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
