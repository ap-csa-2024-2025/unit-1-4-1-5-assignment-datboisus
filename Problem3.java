public class Problem3
{
    public static void main (String[] args)
    {
        int value = 1234;
        System.out.println("Four digit number: " + value);
        System.out.println("Here are the digits:");
        System.out.println(value % 10);
        value /=10;
        System.out.println(value % 10);
        value /=10;
        System.out.println(value % 10);
        value /=10;
        System.out.println(value % 10);

    }
}

