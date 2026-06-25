package stack;

import java.util.ArrayList;

public class StackA {
    /* Implementation of Stack using ArrayList */
    static class Stack{

        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.isEmpty();
        }

        //Push
        public static void push(Integer a){
            list.add(a);
        }

        //Pop
        public static int pop(){
            if(list.isEmpty())
                return -1;

            int top = list.get(list.size()-1);
            list.remove(list.get(list.size()-1));
            return top;
        }

        //Peek
        public static int peek(){
            if(list.isEmpty())
                return -1;

            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println( s.peek());
            s.pop();
        }
        s.push(20);
        s.push(21);
        System.out.println(s.peek());
    }
}
