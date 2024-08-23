import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (m.containsKey(num)) {
                res[0] = m.get(num);
                res[1] = i;
                return res;
            }
            m.put(nums[i], i);
        }
        return res;
    }
}
