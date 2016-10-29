/*
Given an array of n integers,
find and print its number of negative subarrays on a new line.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }

        int amount = 0;

        for(int x = 0;x < arr.length;x++){
            int sum = 0;
            for(int y = x ;y < arr.length;y++){
                sum += arr[y];
                if(sum<0)
                    amount++;
            }
        }

        System.out.println(amount);
    }
}