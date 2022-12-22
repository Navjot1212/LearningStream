package streamPractice;

import java.util.Arrays;
import java.util.List;

public class PracticeMapAndFilter {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(12, 23, 34, 45, 56, 67, 78, 89, 90);

//		//double the list numbers
		// with list
//		nums.replaceAll(n->n*2);
//		nums.forEach(System.out::println);
		// with stream
//		nums.stream().map(n->n*2).forEach(System.out::println);
//		
//		//square the list numbers
//		nums.stream().map(n->n*n).forEach(System.out::println);
//		
//		//even numbers in list
//		nums.stream().filter(n->n%2==0).forEach(System.out::println);
//		
//		//odd numbers in list
//		nums.stream().filter(n->n%2!=0).forEach(System.out::println);
//
//		//Printing first digit of list
//		nums.stream().map(n->n/10).forEach(System.out::println);
//
//		//Printing last digit of list
//		nums.stream().map(n->n%10).forEach(System.out::println);
//		
//		//Printing numbers more 50
//		nums.stream().filter(n->n>50).forEach(System.out::println);

		List<String> strList = Arrays.asList("Hello", "Hi", "Hey", "*$*", "Nav", "Jot","xx");

//		//Adding * to string
//		strList.stream().map(s -> s + "*").forEach(System.out::println);
//		
//		//to lower case
//		strList.stream().map(s -> s.toLowerCase()).forEach(System.out::println);
		
//		//to upper case
//		strList.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
		
//		//removing a letter
//		strList.stream().map(s -> s.replace("H", "")).forEach(System.out::println);
//		strList.replaceAll(s->s.replace("x", ""));
//		strList.forEach(System.out::println);
		

		

		
		

	}

}
