import java.util.*;
public class queue
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> que = new ArrayDeque<>();
        que.push(10);
        que.push(20);
        que.push(30);
        que.push(40);
        System.out.println(que);
        que.push(50);
        System.out.println(que.getFirst());
        que.push(60);
        System.out.println(que.removeFirst());
        System.out.println(que);

    }
}
