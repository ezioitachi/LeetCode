


public class TwoSum{

	public static int[] twosum(int[] nums, int target){
		
		nums=[2,7,11,15];
		target=9;

		if(nums==0||nums.length<2){
			int[] res=new int[]{-1,-1};
		}

		int[] res=new int[]{-1,-1};
		Hashmap<Integer,Integer> map=new Hashmap<>();
		for(i=0;i<nums.length;i++){
			
			if(map.containskey(target-nums[i])){
				res[0]=map.get(nums[i]);
				res[1]=map.get(target-nums);
				break
			}
			map.put(nums[i],i);
		}
		return res;
	}

}