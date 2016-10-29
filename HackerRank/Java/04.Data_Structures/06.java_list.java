/*
Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> ls = new LinkedList<Integer>();

        for(int i = 0;i < n ; i++){
            ls.add(scan.nextInt());
        }

        int command_n = scan.nextInt();

        for(int j= 0;j < command_n ; j++){
            String command = scan.next();
            if(command.equals("Insert")){
                int x = scan.nextInt();
                int y = scan.nextInt();
                ls.add(x,y);
            }
            if(command.equals("Delete")){
                int x = scan.nextInt();
                ls.remove(x);
            }
        }

        for(int i :ls){
            System.out.print(i+" ");
        }
    }
}
