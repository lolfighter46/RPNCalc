import java.util.Stack;

public class Adder
{
    Stack<Integer> st;
    public Adder(Stack<Integer> st) {
        this.st = st;
    }
    public void operate() {
        st.push(st.pop()+st.pop());
    }
}