// Java program to count trailing 0s in n!
import java.util.Scanner;
class Week2_3 {
    // Function to return trailing
    // 0s in factorial of n
    static int findTrailingZeros(int n)
    {
        if (n < 0) // Negative Number Edge Case
            return -1;

        // Initialize result

        int count=0;
        // Keep dividing n by powers
        // of 5 and update count
        for (int i = 5; n / i >= 1;i*=5)
            count += n / i;

        return count;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int n ;
        Scanner sc= new Scanner(System.in);
        System.out.println();
        n = sc.nextInt();
        System.out.print(findTrailingZeros(n));
    }
}
