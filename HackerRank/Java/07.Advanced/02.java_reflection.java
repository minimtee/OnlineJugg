/*
JAVA reflection is a very powerful tool to inspect the attributes of a class in runtime.

For example, we can retrieve the list of public fields of a class using getDeclaredMethods().

In this problem, you will be given a class Solution in the editor. You have to prints all the methods of another class called Student in alphabetical order.
*/

public class Solution {

        public static void main(String[] args){
            Class student = Student.class;
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method m : methods){
                methodList.add(m.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }
