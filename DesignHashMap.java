/**
 * @author Utkrist Ark
 * @date 04-10-2023
 * @version java 11.0.19
 */


package Arrays;

import java.util.Arrays;

class MyHashMap {
    int [] map;
    public MyHashMap() {
         map = new int[1000000];
        Arrays.fill(map, -1);
    }

    public void put(int key, int value) {
        map[key] =value;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
public class DesignHashMap {

    public static void main(String[] args) {

    }
}
