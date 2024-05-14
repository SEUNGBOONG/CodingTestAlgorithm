package LV0;


import java.util.Stack;
public class StackStudy {
    public static void main(String[] args) {
        Stack<Number> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        System.out.println(stack.pop());
        //LIFO 형식이다보니 가장 마지막에 들어간 3이빠져나간다.

        System.out.println(stack.peek());
        //가장 마지막 값 확인하고 제거하지는 않는다.
        if(!stack.empty()){
            stack.pop();
        }
        //스택이 비어있는지 확인

        stack.add(0,4);

    }


}
