import java.util.*;
public class stack
{
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        st.push(50);
        System.out.println(st.peek());
        st.push(60);
        System.out.println(st.pop());
        System.out.println(st);

    }
}
