import java.util.Stack;

public class Divider
{
    Stack<Integer> st;
    public Divider(Stack<Integer> st) {
        this.st = st;
    }
    public void operate() {
        st.push(st.pop()/st.pop());
    }
}