import java.util.Scanner;

public class week3_1 {

    public static int processArray(int[] inputArray,int size){
        int[] extractedArray = new int[size];
        for(int i=0;i<size;i++){
            extractedArray[i] = extractDigitAtPosition(inputArray[i],i);
        }
        for(int i=0;i<size;i++){
            extractedArray[i]=extractedArray[i]*extractedArray[i];
        }
        int sum=0;
        for(int num: extractedArray){
            sum+=num;
        }
        return sum;
    }
    static int extractDigitAtPosition(int number,int position){
        int digit=0;
        int divisor = (int)Math.pow(10,position);
        if(number>=divisor){
            digit = (number/divisor)%10;
        }
        return digit;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] input1 = new int[size];
        for(int i=0;i<size;i++){
            input1[i]=scan.nextInt();
        }
        int result = processArray(input1,size);
        System.out.print(result);

    }

}
