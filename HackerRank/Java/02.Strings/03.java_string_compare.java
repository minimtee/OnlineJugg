//Given a string, find out the lexicographically smallest and largest substring of length k.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String src = scan.next();
        int range = scan.nextInt();

        List<String> array = new LinkedList<String>();
        int len = src.length();
        for(int i = 0;i < len-range+1 ;i++){
            array.add(src.substring(i,i+range));
        }

        Collections.sort(array);

        System.out.println(array.get(0));
        System.out.println(array.get(len-range));
    }
}