package W2;

public class TwoSome {
    public int[] twoSome(int[] nums, int target){

        int[] result = new int[2];

        for (int i = 0; i < result.length; i++) {
            for (int j = i+1; j < result.length; j++) {
                if (target==nums[i]+nums[j]){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
