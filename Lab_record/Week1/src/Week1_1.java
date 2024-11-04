import java.util.Scanner;

class Week1_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a%2==0){
            System.out.println(1);
        }
        else{
            System.out.println(2);
        }
    }

}