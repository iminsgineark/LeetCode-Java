package org.example;

public class exponential {
    public static int expo(int base, int exp) {
        if (exp ==0 || exp == 1){
            return 1;
        }else if (exp < 0 ){
            return -1;
        }else {
            return base * expo(base,exp-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(expo(2,2));
    }
}
