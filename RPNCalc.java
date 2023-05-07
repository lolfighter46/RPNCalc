import java.util.Stack;
public class RPNCalc
{
    static Stack<Integer> st = new Stack();
    public static void main(String[] args){
        Operand op = new Operand(st);
        Adder add = new Adder(st);
        Subtracter sub = new Subtracter(st);
        Multiplier mul = new Multiplier(st);
        Divider div = new Divider(st);
        ResultPresenter res = new ResultPresenter(st);
        CalculatorGui gui = new CalculatorGui(op,add,sub,mul,div,res);
    }
}
