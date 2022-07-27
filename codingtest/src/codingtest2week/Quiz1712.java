package codingtest2week;

	import java.util.Scanner;
	
	public class Quiz1712 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			int fixed = Integer.parseInt(input.split(" ")[0]);
			int var = Integer.parseInt(input.split(" ")[1]);
			int price = Integer.parseInt(input.split(" ")[2]);
			int count=1;
			if(var>=price) {
				System.out.println(-1);
			}else {
				int dif=price-var;
				long temp=dif;
				while(fixed>=temp) {
					temp+=dif;
					count++;
				}
				System.out.println(count);
			}
			
		}
	}

