public class factorial {
	public static int recursion(int num) {
		if(num < 1){
			return -1;
		}else if(num == 0 || num == 1){
			return 1;
		}else{
			return num * recursion(num - 1);
		}

	}
	public static void main(String[] args){
		System.out.println(recursion(3));
	}
}
