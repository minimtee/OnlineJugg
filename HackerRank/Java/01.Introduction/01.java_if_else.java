    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static boolean isOdd(int n){
            return (n & 1) != 0;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            /*
            If n is odd, print Weird
            If n is even and in the inclusive range of 2 to 5, print Not Weird
            If n is even and in the inclusive range of 6 to 20, print Weird
            If n is even and greater than 20, print Not Weird
            */

            if(isOdd(n)){
                System.out.println("Weird");
            }

            if((!isOdd(n))&&(n>=2)&&(n<=5)){
                System.out.println("Not Weird");
            }

            if((!isOdd(n))&&(n>=6)&&(n<=20)){
                System.out.println("Weird");
            }

            if((!isOdd(n))&&(n>20)){
                System.out.println("Not Weird");
            }

        }
    }
