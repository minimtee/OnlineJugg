import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String regex = "<([^<>]+)>([^<>]+)<\\/\\1>";
		Pattern p = Pattern.compile(regex);
		while(n-- > 0){
			String content = scan.nextLine();
			Matcher m = p.matcher(content);
			int isFind = 0;
			while(m.find()) {
				System.out.println(m.group(2));
				isFind++;
			}
			if(isFind == 0)
				System.out.println("None");


		}
		scan.close();
	}
}