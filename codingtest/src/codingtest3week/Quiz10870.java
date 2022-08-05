package codingtest3week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz10870 {

	public static void main(String[] args) throws IOException {

		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * String input = br.readLine(); int num = Integer.parseInt(input)+1; int[] arr
		 * = new int[num+1]; arr[0] = 0; arr[1] = 1; for(int i=2;i<num;i++) { arr[i] =
		 * arr[i-2] + arr[i-1]; } System.out.println(arr[num-1]);
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		System.out.println(pabo(num));
			
	}
	public static int pabo(int a) {
		if(a==0) {
			return 0;
		}else if(a==1) {
			return 1;
		}else {
			return pabo(a-1) + pabo(a-2);
		}
	}
	
	
}
