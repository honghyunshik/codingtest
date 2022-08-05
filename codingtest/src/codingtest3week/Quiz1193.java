package codingtest3week;

import java.util.Scanner;

public class Quiz1193 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=1;
		int count=1;
		while(num>sum) {
			count++;
			sum+=count;
		}
		int left, right;
		left = sum-num+1;
		right = count + 1 - left;
		if(count%2==0) {
			System.out.println(right + "/" + left);	
		}else {
			System.out.println(left + "/" + right);
		}
		
	}
}
