package Top100;

import java.util.Stack;

public class StackInteger {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(5);
        sortStack(stack);
        System.out.println(stack);
    }
    static void sortStack(Stack<Integer> s)
    {
        if(!s.isEmpty()){
            int x = s.pop();
            sortStack(s);// sort remaining stack

            insertSortedData(s, x);
            System.out.println(s+" "+x);

        }
    }

    static void insertSortedData(Stack<Integer> s, int x){


        System.out.println("x-------"+x +" stack---------"+s);
        if(s.isEmpty() || x>s.peek()){
            s.push(x);
            return;
        }

        int temp = s.pop();
        insertSortedData(s,x);

        s.push(temp);
    }
}
