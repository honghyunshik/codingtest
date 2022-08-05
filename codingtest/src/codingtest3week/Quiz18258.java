package codingtest3week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Quiz18258 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<num;i++) {
        	input = br.readLine();
        	if(input.startsWith("push")) {
        		input = input.replace("push ", "");
        		int input_int = Integer.parseInt(input);
        		arr.add(input_int);
        	}else if(input.equals("pop")) {
        		if(arr.size()!=0) {
        			System.out.println(arr.get(0));
            		arr.remove(0);
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
        			
        	}else if(input.equals("front")) {
        		if(arr.size()!=0) {
        			System.out.println(arr.get(0));
        		}else {
        			System.out.println(-1);
        		}
        	}else if(input.equals("back")) {
        		if(arr.size()!=0) {
        			System.out.println(arr.get(arr.size()-1));
        		}else {
        			System.out.println(-1);
        		}
        	}
        }
        
	}
	
	public static void pop(ArrayList<Integer> arr) {
		
	}
	
	public static void push(ArrayList<Integer> arr, int num) {
		
	}
	
	public static void size(ArrayList<Integer> arr) {
		
	}
	
	public static void empty(ArrayList<Integer> arr) {
		
	}
	
	public static void front(ArrayList<Integer> arr) {
		
	}
	
	public static void back(ArrayList<Integer> arr) {
		
	}
}
