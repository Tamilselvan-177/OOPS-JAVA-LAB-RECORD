import java.util.Scanner;

public class Week2_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name ="";
        String value = input.nextLine();
        for(int i=0;i<value.length();i++){
            switch((value.charAt(i))){
                case '1':
                    name = "One";
                    break;
                case '2':
                    name = "Two";
                    break;
                case '3':
                    name = "Three";
                    break;
                case '4':
                    name = "Four";
                    break;
                case '5':
                    name = "Five";
                    break;
                case '6':
                    name = "Six";
                    break;
                case '7':
                    name = "Seven";
                    break;
                case '8':
                    name ="Eight";
                    break;
                case '9':
                    name = "Nine";
                    break;
                case '0':
                    name = "Zero";
                    break;
            }
            System.out.print(name+" ");
        }
    }
}