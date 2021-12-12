import java.util.Arrays;

public class _1_TwoSums {

    public static int[] twoSum(int[] nums, int target) {
        for(int x = 0; x < nums.length ; x++){
            System.out.println("x = " + x);
            for(int y = x+1; y <nums.length ; y++){
                    int sum = nums[x] + nums[y];
                    System.out.println(sum);
                    if (sum == target) {
                        return new int[]{x, y};
                    }
                }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,5,5,11};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }


}
