import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> mystack = new Stack<>();
        Stack<Integer> mystack2 = new Stack<>();
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        System.out.println("before:");
        for (Integer integer: mystack){
            System.out.println(integer);
        }
        System.out.println("after:");
        while (!mystack.isEmpty()){
            System.out.println(mystack.pop() + ",");
        }
    }
}
