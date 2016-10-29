/*
You are given a 6*6 2D array. An hourglass in an array is a portion shaped like this:

a b c
  d
e f g

In this problem you have to print the largest sum among all the hourglasses in the array.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int[] sums = new int[16];
        int index = 0;

        for(int n = 0 ;n<4;n++){
            for(int m =0 ;m<4;m++){
                sums[index] = arr[n][m] + arr[n][m+1] + arr[n][m+2] + arr[n+1][m+1] + arr[n+2][m] + arr[n+2][m+1] + arr[n+2][m+2];
                index++;
            }
        }

        int large = sums[0];
        for(int x = 0;x<16;x++){
            large = (sums[x] > large)?sums[x]:large;
        }

        System.out.println(large);
    }
}
