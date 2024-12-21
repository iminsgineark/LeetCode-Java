public class sumofdigits{
	public static int sumofdig(int num){
		if(num==0 || num<0){
			return 0;
		}else{
			return num%10 + sumofdig(num/10);
		}
	}
	public static void main(String[] args) {
		System.out.println(sumofdig(53));
	}
}
