import java.util.Scanner;
public class Week2_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String result = pattern(n);
        System.out.println(result);
    }
    public static String pattern(int n){
        if (n==1){
            return "1";

        }
        String prev = pattern(n-1);
        return prev+' '+n+' '+prev;
    }
}