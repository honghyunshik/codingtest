package codingtest3week;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;

public class Quiz18258 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int size=0;
        int num = Integer.parseInt(input);
        LinkedList<Integer> arr = new LinkedList<>();
        for(int i=0;i<num;i++) {
        	input = br.readLine();
        	if(input.startsWith("push")) {
        		input = input.replace("push ", "");
        		int input_int = Integer.parseInt(input);
        		arr.add(input_int);
        		size++;
        	}else if(input.equals("pop")) {
        		if(size!=0) {
        			bw.write(arr.get(0) + "\n");
            		arr.remove();
            		size--;
        		}else {
        			bw.write(-1 + "\n");
        		}
        		
        	}else if(input.equals("size")) {
        		bw.write(size + "\n");
        	}else if(input.equals("empty")) {
        		if(arr.isEmpty()) {
        			bw.write(1 + "\n");
        		}else {
        			bw.write(0 + "\n");
        		}
        			
        	}else if(input.equals("front")) {
        		if(size!=0) {
        			bw.write(arr.get(0) + "\n");
        		}else {
        			bw.write(-1 + "\n");
        		}
        	}else if(input.equals("back")) {
        		if(size!=0) {
        			bw.write(arr.get(size-1) + "\n");
        		}else {
        			bw.write(-1 + "\n");
        		}
        	}
        }
        bw.close();
	}
	
}
