/*

Task

You have a test string S.
Your task is to write a regex that will match S with the following conditions:

S must be of length: 20
01 character: lowercase letter.
02 character: word character.
03 character: whitespace character.
04 character: non word character.
05 character: digit.
06 character: non digit.
07 character: uppercase letter.
08 character: letter (either lowercase or uppercase).
09 character: vowel (a, e, i , o , u, A, E, I, O or U).
10 character: non whitespace character.
11 character: should be same as 1st character.
12 character: should be same as 2nd character.
13 character: should be same as 3rd character.
14 character: should be same as 4th character.
15 character: should be same as 5th character.
16 character: should be same as 6th character.
17 character: should be same as 7th character.
18 character: should be same as 8th character.
19 character: should be same as 9th character.
20 character: should be same as 10th character.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^([a-z][\\w][\\s][^\\w][\\d][^\\d][A-Z][a-zA-Z][aeiouAEIOU][^\\s])\\1$");

    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }

}