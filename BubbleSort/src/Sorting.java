import java.util.Scanner;

/**
 * Created by c2612 on 17.10.2014.
 */
public class Sorting {

    public static void main (String [] args){
       // int intArr[] = new int[] {115,10,9,186,110};
        int intArr[];
        intArr = new int[5];


        Scanner scann = new Scanner(System.in);
        System.out.println("Enter number: ");

        for (int i=0; i< intArr.length; i++)
        {
            System.out.println(intArr[i] = scann.nextInt());
        }


        for (int i=0; i< intArr.length; i++){
            System.out.print(intArr[i] + " ");

        }
        bubbleSort(intArr);
        System.out.println(" ");
        for(int i=0; i< intArr.length; i++){
            System.out.print(intArr[i] + " ");
        }
    }
    private static void bubbleSort (int [] intArr){
        int n = intArr.length;
        int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i); j++){
                if(intArr[j-1]>intArr[j]){
                    temp = intArr[j-1];
                    intArr[j-1]=intArr[j];
                    intArr[j]=temp;
                }
            }
        }
    }

}
