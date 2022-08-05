package codingtest3week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quiz2869 {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] input_lst = input.split(" ");
		int up = Integer.parseInt(input_lst[0]);
		int down = Integer.parseInt(input_lst[1]);
		int goal = Integer.parseInt(input_lst[2]);
		
		int one_day = up-down;
		goal -= down;
		
		int ans = (int) Math.ceil((double)goal/one_day);     //올림 메소드
		System.out.println(ans);
	}
}
