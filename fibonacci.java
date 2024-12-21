public class fibonacci{
	public static int num(int num){
		if(num < 0) {
			return -1;
		}else if(num == 0 || num == 1 ){
			return 1;
		}else{
			return num(num-1) + num(num-2);
		}
	}
	public static void main(String[] args){
		System.out.println(num(5));

	}
}
