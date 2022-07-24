package codingtest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Quiz3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] array = new Integer[10];
		for(int i=0;i<10;i++) {
			array[i] = sc.nextInt()%42;
		}
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(array)); 
		System.out.println(set.size());
	}
}
