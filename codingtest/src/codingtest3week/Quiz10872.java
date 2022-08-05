package codingtest3week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(input);
		/*
		 * int ans=1; for(int i=1;i<=num;i++) { ans*=i; }
		 */
       
        System.out.println(fac(num));
        
	}
	
	public static int fac(int a) {
		if(a==0) {
			return 1;
		}else {
			return a*fac(a-1);
		}
	}
}
