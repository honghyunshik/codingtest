package codingtest2week;

import java.math.BigInteger;
import java.util.Scanner;

public class Quiz11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String input_str = sc.next();
		BigInteger input_int = new BigInteger(input_str);
		BigInteger ten = new BigInteger("10");
		BigInteger ans = new BigInteger("0");
		for(int i=0;i<num;i++) {
			ans = ans.add(input_int.remainder(ten));
			input_int = input_int.divide(ten);
		}
		int ans_int = ans.intValue();
		System.out.println(ans_int);
	}
}
