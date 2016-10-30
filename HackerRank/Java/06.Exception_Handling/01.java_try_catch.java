/*
You will be given two integers x and y as input, you have to compute x/y.
If x and y are not 32 bit signed integers or if y is zero, exception will occur and you have to report it.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a/b);
        }catch(InputMismatchException ime){
            System.out.println(ime.getClass().getName());
        }catch(ArithmeticException ae){
            System.out.println(ae.getClass().getName()+": "+ae.getMessage());
        }catch(Exception i){
            System.out.println(i.getMessage());
        }
    }
}