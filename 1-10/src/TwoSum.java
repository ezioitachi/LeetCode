import java.util.HashMap;

public class TwoSum {


    public static int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length < 2) {
            int[] res = new int[]{-1, -1};
        }

        int[] res = new int[]{-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }
    public static void main(String[] args){
        int[] a= {2,7,11,15};
        int b=9;

        System.out.print(twoSum(a,b));
    }


}
