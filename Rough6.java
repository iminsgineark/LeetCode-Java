package Arrays;

public class Rough6 {
    public static void permuataion(String s,int l,int r){
        if (l >= r){
            System.out.println(s);
            return;
        }
        for (int i = l;i<=r;i++){
            s = swap(s,l,i);
            permuataion(s,l+1,r);
            s = swap(s,l,i);
        }
    }
    public static String swap(String s,int i,int j){
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "ABC";
        permuataion(s,0,s.length()-1);
    }
}
