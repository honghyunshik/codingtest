package codingtest2week;

import java.util.Scanner;

public class Quiz10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		for(char i='a';i<='z';i++) {
			boolean check = false;
			for(int j=0;j<input.length();j++) {
				if(input.charAt(j)==i) {
					System.out.print(j + " ");
					check = true;
					break;
				}
			}
			if(!check) System.out.print(-1 + " ");
			
		}
	}
}
