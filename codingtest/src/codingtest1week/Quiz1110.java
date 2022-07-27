package codingtest1week;

import java.util.Scanner;

public class Quiz1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count=0;
		int temp=a;
		while(a!=temp||count==0) {
			count++;
			if(temp<10) {
				temp = temp*10 + temp;
			}else {
				temp = temp%10*10 + (temp/10 + temp%10)%10;
			}
		}
		System.out.println(count);
	}
}
