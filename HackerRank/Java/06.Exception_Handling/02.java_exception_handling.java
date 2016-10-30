/*
This method takes two integers, n and p , as parameters and finds n^p.
If either n or p is negative, then the method must throw an exception which says "n and p should be non-negative".
*/

import java.util.*;
import java.util.Scanner;

class MyCalculator{

	public int power(int n, int p) throws Exception{
		if(n < 0 || p < 0){
			throw new Exception("n and p should be non-negative");
		}
		int sum = 1;

		for(int i = 0;i < p;i++){
			sum *= n;
		}
		return sum;
	}
}

class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while ( in .hasNextInt()) {
			int n = in .nextInt();
			int p = in .nextInt();
			MyCalculator my_calculator = new MyCalculator();
			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}