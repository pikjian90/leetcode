import java.util.Arrays;
import java.util.HashMap;

public class _1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));
    }

    public static int[] twoSum(int[] nums,int target){
//        //easier but o(1)
//        int[] num = new int[2];
//        for(int x = 0; x<nums.length;x ++){
//            for(int y = x+1; y< nums.length;y++){
//                System.out.println(nums[x]+" + "+nums[y]);
//                if(nums[x]+nums[y] == target){
//                    num = new int[] {nums[x], nums[y]};
//                    break;
//                }
//            }
//        }
//        return num;

        //o(n)
        HashMap<Integer,Integer> indexMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int requiredNum = target - nums[i];
            if(indexMap.containsKey(requiredNum)){
                int[] toReturn = {indexMap.get(requiredNum),i};
                System.out.println(Arrays.toString(toReturn));
                return toReturn;
            }
            indexMap.put(nums[i],i);
            System.out.println(" - " + nums[i]);
            System.out.println(" - " + i);
        }
        return null;
    }

}
