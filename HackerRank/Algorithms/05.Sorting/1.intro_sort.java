// Given a sorted array (ar) and a number (V)
// print the index location of V in the array.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        int len = scan.nextInt();
        int[] array = new int[len];
        for(int i=0;i<len;i++){
            array[i] = scan.nextInt();
        }

        for(int j=0;j<len;j++){
            if(array[j] == target){
                System.out.println(j);
                return;
            }
        }
    }
}