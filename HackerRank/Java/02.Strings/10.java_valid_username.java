/*
Regular expressions help us match or search for patterns in strings. In this problem, you will be given a username. Your task is to check whether that username is valid. A valid username will have the following properties:

The username can contain alphanumeric characters and/or underscores(_).
The username must start with an alphabetic character.
8 <= |Username| <= 30.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());

		String regex = "^[a-zA-Z][\\w]{7,29}$"
		Pattern p = Pattern.compile(regex);

		while(n-- > 0){
			String name = scan.nextLine();
			Matcher m = p.matcher(name);
			System.out.println(m.find()?"Valid":"Invalid");
		}
	}
}