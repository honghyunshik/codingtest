package codingtest;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int total = a*b*c;
		HashMap<Integer,Integer> map = new HashMap<>();
		while(total!=0) {
			int temp = total%10;
			if(map.containsKey(temp)) {
				map.put(temp,map.get(temp)+1);
			}else map.put(temp, 1);
			total/=10;
		}
		for(int i=0;i<=9;i++) {
			if(map.containsKey(i)) {
				System.out.println(map.get(i));
			}else System.out.println(0);
		}
	}
}
