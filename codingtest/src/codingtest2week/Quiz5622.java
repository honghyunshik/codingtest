package codingtest2week;

import java.util.Scanner;

public class Quiz5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String input_convert = convert(input);
		int ans = count(input_convert);
		System.out.println(ans);
	}
	
	public static String convert(String a) {
		String num = "";
		for(int i=0;i<a.length();i++) {
			char temp = a.charAt(i);
			if(temp=='A'||temp=='B'||temp=='C') {
				num+=2;
			}else if(temp=='D'||temp=='E'||temp=='F') {
				num+=3;
			}else if(temp=='G'||temp=='H'||temp=='I') {
				num+=4;
			}else if(temp=='J'||temp=='K'||temp=='L') {
				num+=5;
			}else if(temp=='M'||temp=='N'||temp=='O') {
				num+=6;
			}else if(temp=='P'||temp=='Q'||temp=='R'||temp=='S') {
				num+=7;
			}else if(temp=='T'||temp=='U'||temp=='V') {
				num+=8;
			}else if(temp=='W'||temp=='X'||temp=='Y'||temp=='Z') {
				num+=9;
			}
		}
		return num;
	}
	
	public static int count(String a) {
		int ans = 0;
		for (int i=0;i<a.length();i++) {
			int temp = a.charAt(i)-48;
			ans+=temp+1;
		}
		return ans;
	}
}
