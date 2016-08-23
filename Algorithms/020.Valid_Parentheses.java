
/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.*/

public class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if(map.keySet().contains(currentChar)){//open brackets
                stack.push(currentChar);
            }else{
                if(!stack.empty()&&map.get(stack.peek())==currentChar) stack.pop();
                else return false;
            }
        }
        
        return stack.empty();
    }
}
