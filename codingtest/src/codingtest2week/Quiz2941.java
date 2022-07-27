package codingtest2week;

import java.util.Scanner;

public class Quiz2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] lst = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		int ans = 0;
		while(true) {
			boolean check = false;
			for(String word:lst) {
				if(input.contains(word)) {
					input = input.replaceFirst(word, "x");
					check = true;
					break;
				}
			}
			if(!check) {
				ans+=input.length();
				break;
			}
		}
		System.out.println(ans);
	}
}
