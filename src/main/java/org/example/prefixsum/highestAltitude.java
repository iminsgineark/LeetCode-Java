package org.example.prefixsum;

public class highestAltitude {
    public static int largestAltitude(int[] gain) {
        int current = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            current = current+gain[i];
            max = Math.max(current,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] ls = {-5,1,5,0,-7};
        System.out.println(largestAltitude(ls));
    }
}
