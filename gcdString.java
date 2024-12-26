public class gcdString {
        public static String gcdOfStrings(String s1, String s2){
		int l1 = s1.length();
		int l2 = s2.length();
		if(!(s1+s2).equals(s2+s1)){
			return "";
		}
		String result = s1.substring(0,gcd(l1,l2));
		return result;
        }
        public static int gcd(int n1, int n2){
		if(n2 == 0){
			return n1;
		}
		return gcd(n2,n1%n2);
        }
        public static void main(String[] args){
		String str1 = "ABCABC";
		String str2 = "ABC";
		System.out.println(gcdOfStrings(str1,str2));
        }
}  
