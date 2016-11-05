/*

In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated more than once, but retain the first occurrence of any case-insensitive repeated word.

Input Format

The following input is handled for you the given stub code:

The first line contains an integer, n, denoting the number of sentences.
Each of the n subsequent lines contains a single sentence consisting of English alphabetic letters and whitespace characters.

Sample Input

5
Goodbye bye bye world world world
Sam went went to to to his business
Reya is is the the best player in eye eye game
in inthe
Hello hello Ab aB
Sample Output

Goodbye bye world
Sam went to his business
Reya is the best player in eye game
in inthe
Hello Ab

*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public Solution{
	public static void main(String[] args){
		String regex = "\\b(\\w+)(\\b\\w+\\b\\1\\b)*";
		Pattern p = Pattern.compile(regex,Pattern.MULTILINE + Pattern.CASE_INSENSITIVE);

		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());

		while(n-- > 0){
			String input = scan.nextLine();
			Matcher m = p.matcher(input);
			while(m.find()){
				input = input.replaceAll(m.group(),m.group(1));
			}
			System.out.println(input);
		}

		scan.close();
	}
}