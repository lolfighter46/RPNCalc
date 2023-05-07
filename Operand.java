import java.util.Stack;

public class Operand implements OperandIf
{
    Stack<Integer> st = new Stack();
    StringBuffer number = new StringBuffer();
    private int value;
    public void addDigit(char digit){
        number.append(digit);
    }
    public void deleteLastDigit(){
        if(number.length() > 0)
        {
            number.deleteCharAt(number.length() - 1);
        }
    }
    public Operand(final Stack<Integer> st) {
        this.st = st;
    }
    public void complete(){
        st.push(Integer.parseInt(number.toString()));
        number.setLength(0);
        System.out.println(st);
    }
    public void reset(){
        number.setLength(0);
        st.removeAllElements();
    }
}
