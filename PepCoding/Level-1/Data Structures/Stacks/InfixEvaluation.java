/*
1. You are given an infix expression.
2. You are required to evaluate and print it's value.
COMMENTConstraints
1. Expression is balanced
2. The only operators used are +, -, *, /
3. Opening and closing brackets - () - are used to impact precedence of operations
4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
5. In two operators of equal precedence give preference to the one on left.
6. All operands are single digit numbers.
Sample Input
2 + 6 * 4 / 8 - 3
Sample Output
2
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        int ans=infixEvaluation(exp);
        System.out.println(ans);

    }
public static int infixEvaluation(String exp){
        Stack<Integer> operand=new Stack<>();
        Stack<Character> operator=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='('){
                operator.push(ch);
            }
            else if(ch>='0' && ch<'9'){
                operand.push(ch-'0');
            }
            else if(ch==')'){
                //evaluate till opening bracket
                while(operator.peek()!='('){
                    char opr=operator.pop();
                    int b=operand.pop();
                    int a=operand.pop();
                    int val=calulate(a,b,opr);
                    operand.push(val);
                }
                operator.pop();// pop '('
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                //ch-> operator
                while(operator.size()>0 && operator.peek()!='(' &&
                        priority(ch)<=priority(operator.peek())){
                    char opr=operator.pop();
                    int b=operand.pop();
                    int a=operand.pop();
                    int val=calulate(a,b,opr);
                    operand.push(val);

                }
                operator.push(ch);
            }
        }

        while(operator.size()>0){
            char opr=operator.pop();
            int b=operand.pop();
            int a=operand.pop();
            int val=calulate(a,b,opr);
            operand.push(val);
        }
        return operand.peek();
    }
    public static int calulate(int a, int b, char opr){
        if(opr=='+'){
            return a+b;
        }else if(opr=='-'){
            return a-b;
        }
        else if(opr=='*'){
            return a*b;
        }
        else if(opr=='/'){
            return a/b;
        }
        else{
            return -1;
        }
    }

    public static int priority(char opr){
        if(opr=='+'||opr=='-')
            return 1;
        else if(opr=='*'||opr=='/')
            return 2;
        else
            return -1;

    }
}