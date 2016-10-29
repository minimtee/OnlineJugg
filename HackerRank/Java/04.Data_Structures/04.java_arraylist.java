/*
You are given n lines.
In each line there are zero or more integers.
You need to answer a few queries where you need to tell the number located in yth position of xth line.

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output

74
52
37
ERROR!
ERROR!

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int array_n = scan.nextInt();

        ArrayList<ArrayList<Integer>> whole = new ArrayList<>();

        for(int i = 0;i < array_n;i++){
            int element_n = scan.nextInt();

            ArrayList<Integer> row = new ArrayList<>();

            for(int j = 0;j < element_n;j++){
                row.add(scan.nextInt());
            }
            whole.add(row);
        }

        int command_n = scan.nextInt();

        for(int i = 0;i < command_n;i++){
            try{
                System.out.println(whole.get(scan.nextInt()-1).get(scan.nextInt()-1));
            }catch(IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }

        scan.close();
    }
}