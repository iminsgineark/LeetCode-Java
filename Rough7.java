package Arrays;
//HashMap Implementation
/**
 * @author Utkrist Ark
 * @date 03-09-2023
 * @version java 17.0.7 
 */

import java.util.ArrayList;
import java.util.LinkedList;

class Hashing{
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node>buckets[];
        public HashMap(){
            this.n = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int HashFunction(K key){
            int BucketIndex = key.hashCode();
            return Math.abs(BucketIndex) % N;
        }
        private int SearchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N * 2];
            for (int i = 0; i < N * 2; i++) {
                buckets = new LinkedList[N * 2];
            }
            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    Put(node.key, node.value);
                }
            }
        }
        public void Put(K key,V value){
            int bucketIndex = HashFunction(key);
            int dataIndex = SearchInLL(key,bucketIndex);
            if (dataIndex == -1){
                buckets[bucketIndex].add(new Node(key,value));
                n++;
            }
            else {
                Node node = buckets[bucketIndex].get(dataIndex);
                node.value = value;
            }
            double lambda = (double) n/N;
            if (lambda > 2.0){ //rehashing
                rehash();
            }
        }
        public boolean containsKey(K key){
            int bucketIndex = HashFunction(key);
            int dataIndex = SearchInLL(key,bucketIndex);
            if (dataIndex == -1){
                return false;
            }
            else {
               return true;
            }
        }
        public V get(K key){
            int bucketIndex = HashFunction(key);
            int dataIndex = SearchInLL(key,bucketIndex);
            if (dataIndex == -1){
               return null;
            }
            else {
                Node node = buckets[bucketIndex].get(dataIndex);
                return node.value;
            }
        }
        public V remove(K key){
            int bucketIndex = HashFunction(key);
            int dataIndex = SearchInLL(key,bucketIndex);
            if (dataIndex == -1){
                return null;
            }
            else {
                Node node = buckets[bucketIndex].remove(dataIndex);
                n--;
                return node.value;
            }
        }
        public ArrayList<K> KeySet(){
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node>ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n == 0;
        }
    }
}
public class Rough7 {
    public static void main(String[] args) {
        // Create Your HashMap Object here and Use put Func() to insert value in it.
    }
}

