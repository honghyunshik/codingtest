package codingtest;

import java.util.Scanner;

public class Quiz2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int hour = Integer.parseInt(input.split(" ")[0]);
		int time = Integer.parseInt(input.split(" ")[1]);
		if(time>=45) {
			time-=45;
		}else {
			if(hour==0) {
				hour=23;
				time+=15;
			}else {
				time+=15;
				hour-=1;
			}
		}
		System.out.println(hour + " " + time);
	}
}
