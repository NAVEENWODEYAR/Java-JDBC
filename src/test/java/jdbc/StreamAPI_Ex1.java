package jdbc;

import java.util.Arrays;
import java.util.List;

public class StreamAPI_Ex1
{
    public static void main(String[] args)
    {
        System.out.println("Stream API");
        Arrays.asList(1,2,3,4,5,6,7,8,9).stream().map((n)->n+n).forEach(System.out::println);

        Arrays.asList("One","Two","Three","Four","Five").stream().map((l)->l.toUpperCase()).forEach(System.out::println);
        List.of(1,2,3,4,5,6,7,8,9,10).stream().filter((n)->n%2 == 0).forEach(System.out::println);
    }
}
