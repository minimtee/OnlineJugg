/*
Given an integer, N , print its first 10 multiples.
Each multiple N x i (where 1<=i<=10 ) should be printed on a new line in the form: N x i = result.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 0 ; i<10;i++){
            System.out.printf("%d x %d = %d%n",n,i+1,n*(i+1));
        }

    }
}