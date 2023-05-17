import java.util.Hashtable;

/*
 * Input an array say {2,7,11,13} and a target say 9. If addition of any two numbers is equals to target then return
 * the indexes eg. here result is [0,1].
 * Solution time complexity O[n]
 * Space Complexity O[n]
 */
public class TwoSum {
	public static int[] getTwoSum(int num[], int target) {		
		Hashtable<Integer, Integer> store = new Hashtable<>();
		for(int i=0; i<num.length; i++) {
			int complement = target-num[i];			
			if(store.containsKey(complement))
				return new int[] {store.get(complement),i};
			store.put(num[i], i);
		}
		return new int[] {};
	}
	
	public static void main(String[] args) {
		int res[]=getTwoSum(new int[]{2,7,1,8},9);
     System.out.println(res[0]+ " " + res[1]);

	}

}
