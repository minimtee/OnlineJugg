/*

You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address.
Use the following definition of an IP address:

IP address is a string in the form "A.B.C.D",
where the value of A, B, C, and D may range from 0 to 255.
Leading zeros are allowed.
The length of A, B, C, or D can't be greater than 3.

*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String ip = scan.next();
			Pattern p = Pattern.compile("^(((\\d{1,2})|([01]\\d{1,2})|(2[0-4]\\d)|(25[0-5]))\\.){3}((\\d{1,2})|([01]\\d{1,2})|(2[0-4]\\d)|(25[0-5]))$");
			Matcher m = p.matcher(ip);
			System.out.println((m.find())?"True"?"False");
		}
	}
}