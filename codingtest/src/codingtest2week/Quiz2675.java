package codingtest2week;

import java.util.Scanner;

public class Quiz2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		for(int k=0;k<count+1;k++) {
			try {
				String input = sc.nextLine();
				int num = Integer.parseInt(input.split(" ")[0]);
				String str = input.split(" ")[1];
				for(int i=0;i<str.length();i++) {
					for(int j=0;j<num;j++) {
						System.out.print(str.charAt(i));
					}
				}	
				System.out.println();
			}catch(Exception e){
			}
		}
		
		
	}
}
