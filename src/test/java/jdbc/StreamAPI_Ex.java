package jdbc;

import java.util.Arrays;

public class StreamAPI_Ex
{
    public static void main(String[] args)
    {
        System.out.println("Stream API");
        Arrays.asList(1,2,3,4,5,6,7,8,9).stream().map((n)->n*n).forEach(System.out::println);
    }
}
