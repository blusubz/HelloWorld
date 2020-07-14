public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.print(fibonacci(6));
    }

    // Method
    public static int fibonacci(int n)
    {
        // base case
        if (n == 0)
            return 0;
        // base case
        if (n == 1)
            return 1;

        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}