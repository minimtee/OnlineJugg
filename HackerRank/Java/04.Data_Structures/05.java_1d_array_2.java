/*

You are given an array of length n, indexed from 0 to n-1.
Each element of the array is either 0 or 1.
You can only move to an index which contains 0.
At first, you are at the 0th position.
In each move you can do one of the following things:

1.Walk one step forward or backward.

2.Make a jump of exactly length  forward.

That means you can move from position x to x-1, x+1 or x+m in one move, but at least one of the following conditions must be true:

1.The new position contains 0.

2.The new position is greater than n-1.

You can't move backward from position 0.
If you move to any position greater than n-1, you win the game.

Given the array and the length of the jump, you need to determine if it's possible to win the game or not.

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static boolean do_a_try(int index,int m,int[] array){
        if(index < 0 || array[index] == 1){
            return false;
        }

        if((index == array.length-1)||(index+m > array.length-1)){
            return true;
        }

        array[index] = 1;// trick

        return (do_a_try(index+1,m,array) || do_a_try(index+m,m,array)||do_a_try(index-1,m,array));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int game_n = scan.nextInt();

        for(int i = 0;i < game_n; i++){
            // length
            int array_length = scan.nextInt();
            // m
            int m = scan.nextInt();
            // array
            int[] array = new int[array_length];
            for(int j = 0;j < array_length;j++){
                array[j] = scan.nextInt();
            }
            // judge
            if (do_a_try(0,m,array)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}