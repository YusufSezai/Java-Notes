package custom_methods;

public class ListSum {
    public static int listSum(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            count += numbers[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int i = listSum(nums);
        System.out.println(i);
    }
}
/*
public static int listSum(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    } else {
      int lastIndex = nums.length;
      int tail[] = Arrays.copyOfRange(nums, 1, lastIndex);
      return nums[0] + listSum(tail);
    }
  }
 */
