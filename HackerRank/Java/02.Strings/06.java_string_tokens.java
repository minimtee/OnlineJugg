/*
Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String delimiter = "[ _@!,?.']+";
        String[] tokens = s.split(delimiter);

        System.out.println(tokens.length);

        for(int i = 0; i < tokens.length;i++){
            System.out.println(tokens[i]);
        }

        scan.close();
    }
}