import java.util.Arrays;

public class _1480_RunningSumof1dArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for(int r=0;r<nums.length;r++){
            sum = sum + nums[r];
            result[r] = sum;
        }
        return result;
    }
}
