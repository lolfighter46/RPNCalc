import java.util.Stack;

public class Subtracter
{
    Stack<Integer> st;
    public Subtracter(Stack<Integer> st) {
        this.st = st;
    }
    public void operate() {
        st.push(st.pop()-st.pop());
    }
}