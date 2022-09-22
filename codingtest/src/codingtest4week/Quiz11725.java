package codingtest4week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Quiz11725 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList<Node> arr = new ArrayList<>();
        
        int num = Integer.parseInt(input);
        int[] ans = new int[num-1];
        
        for(int i=1;i<=num;i++) {
        	Node nd = new Node(i);
        	arr.add(nd);
        }
        arr.get(0).setLength(1);    //루트노드 1
        
        for(int i=0;i<num-1;i++) {
        	input = br.readLine();
        	String[] arrs = input.split(" ");
        	int left = Integer.parseInt(arrs[0])-1;
        	int right = Integer.parseInt(arrs[1])-1;
        	
        	if(arr.get(left).getLength()==0&&arr.get(right).getLength()==0) {
        		
        	}else if(arr.get(left).getLength()==0) {
        		int length = arr.get(right).getLength();
        		arr.get(left).setLength(++length);
        		ans[left-1] = right+1;
        	}else {
        		int length = arr.get(left).getLength();
        		arr.get(right).setLength(++length);
        		ans[right-1] = left+1;
        	}
        }
        
        for(int i=0;i<ans.length;i++) {
        	System.out.println(ans[i]);
        }
	}
} 



class Node{
	
	int length;           //높이
	int value;            //노드 번호
	ArrayList<Integer> child;          //자식노드
	
	
	public Node(int value) {
		this.value = value;
		child = new ArrayList<>();
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public void addChild(int nd) {
		child.add(nd);
	}
	
	public ArrayList<Integer> getChild(){
		return child;
	}
}



