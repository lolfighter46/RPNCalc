import java.util.Stack;

public class ResultPresenter
{
    Stack<Integer> st;
    public ResultPresenter(Stack<Integer> st) {
        this.st = st;
    }
    public void operate() {
        String str = st.pop().toString();
        System.out.println(str);
    }
}