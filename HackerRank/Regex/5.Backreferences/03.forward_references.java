/*

Task

You have a test string S.
Your task is to write a regex which will match S, with following condition(s):

S consists of tic or tac.
tic should not be immediate neighbour of itself.
The first tic must occur only when tac has appeared at least twice before.

Valid S

tactactic
tactactictactic

Invalid S

tactactictactictictac
tactictac

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^tac(tac(tic)?)*$");

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