import java.util.Scanner;

class week1_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b = input.nextInt();
        a = (a>=0)?a:(-1*a);
        b = (b>=0)?b:(-1*b);
        System.out.printf("%d",(a%10)+(b%10));
    }
}