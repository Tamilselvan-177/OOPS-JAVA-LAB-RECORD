import java.util.Scanner;

public class week3_2 {
    public static void main(String[] args){
        //input place

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        //logical space

        int maxLen =0,maxsum=0,currLen=0,currsum=0;
        boolean hasPos = false;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                hasPos=true;
                currLen++;
                currsum+=arr[i];
            }
            else{
                if(currLen>maxLen){
                    maxLen = currLen;
                    maxsum = currsum;
                }
                else if(currLen == maxLen){
                    maxsum+=currsum;
                }

                currLen=0;
                currsum=0;
            }}
        if(currLen>maxLen){
            maxsum=currsum;
        }
        else if(currLen==maxLen){
            maxsum+=currsum;
        }
        int finalResult = hasPos?maxsum:-1;
        System.out.print(finalResult);
    }
}