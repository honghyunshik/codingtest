package codingtest4week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Quiz9012 {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String input = br.readLine();
	        
	        int num = Integer.parseInt(input);
	    
	        for(int j=0;j<num;j++) {
	        	input = br.readLine();
	        	String[] arr = input.split("");
        	int a = 0,b = 0;
        	boolean k=true;
            for(int i=0;i<arr.length;i++) {
            	if(arr[i].equals("(")) {
            		a++;
            	}else {
            		b++;
            		if(a<b) {
            			System.out.println("NO");
            			k=false;
            			break;
            		}
            	}
            }
            if(k) {
            	if(a==b) {
                	System.out.println("YES");
                }else {
                	System.out.println("NO");
                }	
            }
            
        }
        
	}
}
