package stack;

import hashmap.P;

import java.util.Objects;
import java.util.Stack;

public class StatckQ {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){ //base case
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static StringBuilder reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder newStr = new StringBuilder("");
        while(!s.isEmpty()){
            char c = s.pop();
            newStr.append(c);
        }
        return newStr;
    }
    public static void pushAtBottom2(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void stockSpan(int[] stocks, int[] span){
        Stack<Integer> s = new Stack<>();
        span[0]=1;
        s.push(0);

        for(int i=0; i<stocks.length; i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && (currPrice > stocks[s.peek()]) ){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
    public static int[] nextGreater(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] nextG = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextG[i]=-1;
            }else{
                nextG[i]=arr[stack.peek()];
            }
            stack.push(i);
        }
        return nextG;
    }
    public static boolean validParenthesis(String brac){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<brac.length();i++){
            char c = brac.charAt(i);
            //1.Opening braces
            if(c=='(' || c=='{'|| c=='['){
                s.push(c);
            }else{//2.Closing braces
                if(s.isEmpty()){
                    return false;
                } else if(c==')' && s.peek()=='('){
                    s.pop();
                } else if (c=='}' && s.peek()=='{') {
                    s.pop();
                } else if (c==']' && s.peek()=='[') {
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
    public static boolean duplicateParentheses(String exp){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<exp.length(); i++) {
            char c = exp.charAt(i);

            int count = 0;
            if(c!=')' && c!=']' && c!='}'){//Opening braces, operators, var
                stack.push(c);

            }else{//closing braces
                while(!(c==')' && stack.peek()=='(' || c=='}' && stack.peek()=='{' || c==']' && stack.peek()=='[' )){
                    stack.pop();
                    count++;
                }
                stack.pop();
                if(count<1){
                    //Duplicate consists
                    return true;
                }
            }

        }
        //Duplicate not consists
        return false;
    }
    public static void main(String[] args) {
        /*Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

         */

//        System.out.println(reverseString("abc"));

        /*
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(66);

        reverseStack(s);
        printStack(s);

         */
        /*
        int[] stocks = {100,80,60,70,60,85,100};
        int[] span = new int[stocks.length];

        stockSpan(stocks,span);

        for(int i:span){
            System.out.println(i);
        }
         */

        /*
        int[] arr = {6,8,0,1,3};
        int[] nextG = new int[arr.length];
        nextG = nextGreater(arr);
        for(int i:nextG){
            System.out.print(i+" ");
        }

         */

        /*
        String bracs = "(({[]}(){})";
        System.out.println(validParenthesis(bracs));

         */

        String expression = "((a+b)+(c+d))";
        String exp = "(((7)+2))";
        System.out.println(duplicateParentheses(exp));


    }
}
