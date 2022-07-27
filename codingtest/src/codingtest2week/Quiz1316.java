package codingtest2week;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = 0;
		for(int i=0;i<num;i++) {
			String input = sc.next();
			String input_sol = solution(input);
			ans+=check(input_sol);
		}
		System.out.println(ans);
	}
	
	public static int check(String a) {
		int ans = 1;
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<a.length();i++) {
			char temp = a.charAt(i);
				if(map.containsKey(temp)) {
					ans=0;
					break;
				}else {
					map.put(temp, 1);
				}
			
		}
		return ans;
	}
	public static String solution(String str) {
		StringBuilder sb = new StringBuilder(str);
		ArrayList<Integer> lst = new ArrayList<>();
		for(int i=str.length()-1;i>0;i--) {
			if(str.charAt(i)==str.charAt(i-1)) {
				lst.add(i);
			}
		}
		for(Integer num:lst) {
			sb.deleteCharAt(num);
		}
		return sb.toString();
	}
}
