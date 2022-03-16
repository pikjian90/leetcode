public class _2011_FinalValueofVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] operations= {"--X","X++","X++"};
        System.out.println(operations);
    }

    public static int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for(String nums:operations){
            if(nums.startsWith("++") || nums.endsWith("++")){
                result++;
            }else
                result--;
        }
        return result;
    }
}
