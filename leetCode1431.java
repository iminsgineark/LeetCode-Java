import java.util.List;
import java.util.ArrayList;
public class leetCode1431 {
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = -1;
		for(int i = 0;i<candies.length;i++){
			if(candies[i]>max){
				max = candies[i];
			}
		}
		List<Boolean> ans = new ArrayList<>();
		for(int i = 0;i<candies.length;i++){
			if(candies[i]+extraCandies >= max){
				ans.add(true);
			}else{
				ans.add(false);
			}
		}
		return ans;
	}
	public static void main(String[] args){
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		System.out.println(kidsWithCandies(candies,extraCandies));
	}
} 
