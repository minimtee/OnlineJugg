/*
You are given a phone book that consists of people's names and their phone number.
After that you will be given some person's name as query. For each query, print the phone number of that person.

Sample Input

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
Sample Output

uncle sam=99912222
Not found
harry=12299933

*/

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
       Scanner in = new Scanner(System.in);
       int n=in.nextInt();
       in.nextLine();

       // Phone Book
       Map<String,Integer> phone_book = new HashMap<String,Integer>();

       for(int i=0;i<n;i++)
       {
           String name=in.nextLine();
           int phone=in.nextInt();
           in.nextLine();
           phone_book.put(name,phone);
       }
       while(in.hasNext())
       {
           String s = in.nextLine();
           if(phone_book.containsKey(s)){
               System.out.println(s+"="+phone_book.get(s));
           }else{
               System.out.println("Not found");
           }
       }
   }
}
