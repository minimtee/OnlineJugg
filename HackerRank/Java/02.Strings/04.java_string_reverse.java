/*
Given a string A, print Yes if it is a palindrome, print No otherwise.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static boolean isReverse(String s){
        int len = s.length();
        char[] chars = s.toCharArray();
        for(int i = 0;i< len/2 ;i++){
            if(chars[i] != chars[len-1-i]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean result = isReverse(A);
        System.out.println(result?"Yes":"No");
    }
}
