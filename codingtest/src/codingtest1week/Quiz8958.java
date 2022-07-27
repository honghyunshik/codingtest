package codingtest1week;

import java.util.Scanner;

public class Quiz8958 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String[] lst = new String[num];
		for(int i=0;i<num;i++) {
			lst[i] = scan.next();
			
		}
		for(int i=0;i<lst.length;i++) {
			int count=0;
			int ans=0;
			for(int j=0;j<lst[i].length();j++) {
				if(lst[i].charAt(j)=='O') {
					count+=1;
					ans+=count;
				} else {
					count=0;
				}
			}
			System.out.println(ans);
		}
	}
}
