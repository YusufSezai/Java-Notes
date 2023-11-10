package custom_methods;

public class GetMax {
    public static int getMax(int[] nums) {
        int max = 0;
        for (int i : nums) {
            if (i > max) {
                max = i;
            } else {
                max = max;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,15,6,7,8,9};
        int a = getMax(numbers);
        System.out.println(a);
    }
}
/*
public static int getMax (int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    } else {
      int lastIndex = nums.length;
      int tail[] = Arrays.copyOfRange(nums, 1, lastIndex);
      return Math.max(nums[0], getMax(tail));
    }
  }
 */