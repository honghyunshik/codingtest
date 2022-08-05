package codingtest3week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Quiz10828 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<num;i++) {
			input = br.readLine();
			if(input.startsWith("push")) {
				input = input.replace("push ", "");
				int push_num = Integer.parseInt(input);
				arr.add(push_num);
			}else if(input.equals("pop")) {
				if(arr.size()!=0) {
					System.out.println(arr.get(arr.size()-1));
					arr.remove(arr.size()-1);
				}else {
					System.out.println(-1);
				}
			}else if(input.equals("size")) {
				System.out.println(arr.size());
			}else if(input.equals("empty")) {
				if(arr.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(input.equals("top")) {
				if(arr.size()!=0) {
					System.out.println(arr.get(arr.size()-1));
				}else {
					System.out.println(-1);
				}
			}
		}
	}
}
