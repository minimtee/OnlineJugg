/*

Task

You have a test String S.
Your task is to write a regex which will match S with following conditions:

 must start with Mr., Mrs., Ms., Dr. or Er..
And after that it must be followed by one or more letters (lowercase and uppercase both) only.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^(Mr|Mrs|Ms|Dr|Er)\\.[a-zA-Z]+$");
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