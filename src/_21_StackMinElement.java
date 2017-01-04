import java.util.Stack;

/**
 * Created by hezs1 on 2017/1/5.
 */
//定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。

//反正我是觉得这题不好玩

public class _21_StackMinElement {
    Stack<Integer> stack =new Stack<>();                //每次把最小的添加在栈顶
    public void push(int node) {
        if (stack.empty() || node < stack.peek()) {
            stack.add(node);
        }
        else stack.add(stack.peek());
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return stack.peek();
    }
}
