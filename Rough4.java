package Arrays;

public class Rough4 {
    public class Solution {
        public int isPrime(int A) {
            for(int i = 2;i<A;i++){
                if(A % i == 0){
                    return 1;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}
