import java.util.HashMap;
import java.util.Map;

public class Majority {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2, 3, 3, 4, 3, 4, 3, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3};

        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int moreThan = nums.length / 2;

        var hash = new HashMap<Integer, Integer>();

        for (int num : nums) {
            if (hash.containsKey(num)) {
                int count = hash.get(num);
                count++;
                hash.put(num, count);
            } else {
                hash.put(num, 1);
            }
        }
        int max = 0;
        int elem = 0;

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            int value = entry.getValue();
            if (value > moreThan && value > max) {
                max = value;
                elem = entry.getKey();
            }
        }
        return elem;
    }
}
