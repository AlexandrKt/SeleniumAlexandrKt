package lesson2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * Created by c2612 on 20.10.2014.
 */
public class PrimeNumber {

   // public static void main (String args []) {

   @Test
    public void isPrimeTest(){
       Assert.assertEquals(isPrime(3), true);

}
    /*public void isPrime (){
       // Scanner scan = new Scanner(System.in);

        //int num = Integer.parseInt(scan.nextLine());
        int flag = 0;
        for (int i=2; i<num;i++){
            if(num%i==0){
                System.out.println(num + " is not a prime number");
                flag = 1;
            }
        }
        if(flag==0)
            System.out.println(num + " is a prime number");
    }
*/
    public boolean isPrime(int n) {

        boolean prime = true;

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {

                prime = false;

                return prime;

            }

        }
        return prime;

    }

}

