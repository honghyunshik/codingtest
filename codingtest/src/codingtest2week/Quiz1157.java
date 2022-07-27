package codingtest2week;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Quiz1157 {
	public static void main(String[] args) {
		HashMap<Character,Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		input = input.toUpperCase();
		for(int i=0;i<input.length();i++) {
			char temp = input.charAt(i);
			if(map.containsKey(temp)) {
				map.put(temp, map.get(temp)+1);
			}else {
				map.put(temp, 1);
			}
		}
		int maxValue = Collections.max(map.values());
		Character ans = null;
		for (Entry<Character, Integer> entry : map.entrySet()) { 
            if (entry.getValue()==maxValue) {
            	if(ans!=null) {
            		ans = '?';
            	}
            	else {
            		ans = entry.getKey();
            	}
            }
        }
		System.out.println(ans);
		
	}
}
