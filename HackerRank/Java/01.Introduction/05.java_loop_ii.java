/*
input a b n

output ...... (a +...+ 2^(n-1)*b)
*/

import java.util.*;
import java.io.*;
import java.math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a;
            for(int j = 0; j < n;j++){
                System.out.printf("%d ",result + (int)Math.pow(2,j)*b);
                result += (int)Math.pow(2,j)*b;
            }
            System.out.printf("%n");
        }
        in.close();
    }
}
