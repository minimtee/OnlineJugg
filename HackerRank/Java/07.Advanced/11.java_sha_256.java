import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.security.MessageDigest;
import java.util.Scanner;

public class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		try{
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(s.getBytes());
			byte[] digest = md.digest();
			for (byte i : digest) {
				System.out.printf("%02x",i);
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}

	}
}