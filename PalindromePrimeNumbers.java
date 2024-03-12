package Arrays;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i * i <= num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }


    public static boolean isPalindrome(int num){
        int reversed = 0;
        int original = num;
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int N = sc.nextInt();
            int evenCount = 0;
            int oddCount = 0;
            int count = 0;
            int num = 2;
            while(count < N){
                if (isPrime(num) && isPalindrome(num)){
                    count++;
                }
                else if (Integer.toString(num).length() % 2 == 0){
                    evenCount++;
                }
                else{
                    oddCount++;
                }
            }
            num++;
            System.out.println(evenCount + " " + oddCount);
        }
    }
}

