package leetcode.eazy.minstack;

/**
 * Created by mutoulazy on 2017/8/17.
 */
public class test {
    public static void main(String[] args) {
        MinStack2 minStack = new MinStack2();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.top();
        System.out.println(minStack.getMin());
    }
}
