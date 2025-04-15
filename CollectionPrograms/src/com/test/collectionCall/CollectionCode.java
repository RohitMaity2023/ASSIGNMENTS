package com.test.collectionCall;
//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionCode {
	public static void main(String args[]) {
		// few students in my class
		//IMPLEMENTATION OF LIST
//		ArrayList<String> list=new ArrayList<String>();
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("ENTER YOUR NAME:-");
//		for(int i=0;i<5;i++) {
//			list.add(scanner.next());
//			
//		}
//		list.addLast("USER 6");
//		for(String s:list) {
//			System.out.println(s);
//		}
		//IMPLEMENTATION OF SET
		Set<String> set=new HashSet<String>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER YOUR NAME:-");
		for(int i=0;i<5;i++) {
			set.add(scanner.next());
			
		}
	
		for(String s:set) {
			System.out.println(s);
		}
	}

}
