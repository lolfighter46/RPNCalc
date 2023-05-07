import java.util.Stack;

public class Multiplier
{
    Stack<Integer> st;
    public Multiplier(Stack<Integer> st) {
        this.st = st;
    }
    public void operate() {
        st.push(st.pop()*st.pop());
    }
}