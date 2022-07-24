package codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz2480 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int a = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[1]);
		int c = Integer.parseInt(input.split(" ")[2]);
		int ans=0;
		int[] lst = {a,b,c};
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int item : lst){
            if(!arrayList.contains(item))
                arrayList.add(item);
        }
		if(arrayList.size()==1) {
			ans = 10000 + 1000*a;
		}else if (arrayList.size()==2) {
			if(a==b) {
				ans = 1000 + a*100;
			}
			else {
				ans = 1000 + c*100;
			}
		}else {
			ans = Collections.max(arrayList)*100;
		}
			System.out.println(ans);
		}
	
	}

