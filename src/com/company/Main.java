package com.company;
import java.util.Stack;
public class Main {
    public static void main (String[] args) {
        System.out.println(isBalanced(")]}{[("));
    }
    public static boolean isBalanced(String str){
        Stack<Character> s = new Stack<Character>();
        for (int i=0;i< str.length(); i++){
char b = str.charAt(i);
if(b=='(' || b=='{' || b=='['){
    s.push(b);
}
else if(b==')') {
    if (s.isEmpty() || s.peek() != '(')
        return false;
    else s.pop();
}
else if(b== ']') {
    if (s.isEmpty() || s.peek() != '[')
        return false;
    else s.pop();
}else if(b== '}'){
    if(s.isEmpty() || s.peek() != '{')
        return false;
    else s.pop();
}
}
        return s.isEmpty();
}
        }