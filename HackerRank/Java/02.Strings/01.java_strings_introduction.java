/*
Given two strings of lowercase English letters, A and B, perform the following operations:

1.Sum the lengths of A and B.

2.Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).

3.Capitalize the first letter in A and B and print them on a single line, separated by a space.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A =sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B)>0 ? "Yes":"No");
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1) );

    }
}
