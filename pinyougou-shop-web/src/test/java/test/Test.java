package test;

public class Test
{
    public static void main(String[] args)
    {
        String x = "xx";
        String y = "yy";
        exchange(x, y);
        System.out.println();
        System.out.println(x+"<->"+y);
    }

    private static void exchange(String a, String b)
    {
        String temp = a;
        a = b;
        b = temp;
        System.err.println(a+"<->"+b);
        System.err.println();

    }
}