package Arrays;

public class reverseString {
    static String reverseString(String st){
        StringBuilder str = new StringBuilder();
        for(int i = st.length() - 1;i>=0;i--){
            str.append(st.charAt(i));
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String str = "Utkrist Ark";
        System.out.println(reverseString(str));
    }
}
