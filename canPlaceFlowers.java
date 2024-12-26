public class canPlaceFlowers{
	public static boolean canplaceflowers(int[] arr, int n){
		if(n == 0){
			return true;
		}
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			if((i == 0 || arr[i - 1] == 0) && (i == arr.length - 1 || arr[i+1] == 0)){
				count++;
				if(count == n){
					return true;
				}
				i++;
			}
		}
		return false;
	}
	public static void main(String[] args){
		int[] arr = {1,0,0,0,1};
        	int n = 2;
        	System.out.println(canplaceflowers(arr,n));
	}
}
