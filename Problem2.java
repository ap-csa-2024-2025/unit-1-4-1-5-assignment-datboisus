public class Problem2
{
    public static void main (String[] args)
    {
        int value = 123;

        System.out.println("Three Number: " + 123);

        int hundred = value / 100;
        int ten = (value / 10) % 10;
        int one = value % 10;

        System.out.println("Here are the digit:");
        System.out.println(hundred);
        System.out.println(ten);
        System.out.println(one);
    }
}
