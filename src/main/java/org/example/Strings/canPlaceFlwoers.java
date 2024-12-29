package org.example.Strings;

public class canPlaceFlwoers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0){
                if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)){
                    count++;
                    if (count == n) {
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(arr,n));
    }
}
