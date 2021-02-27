/**
 * This class divide the ints of the array into two groups,
 * so that the sum of the two groups is the same
 * with these constraints:
 * all the values that are multiple of 5 must be in one group
 * and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other
 * @author: Dayana Arrieta & Juan José Quintana.
 * @version: 26/02/2021
 */
public class Split53 {
    public boolean split53(int[] nums) {
        return split53(0, nums, 0, 0);
    }

    public boolean split53(int index, int[] nums, int uno, int dos) {
        if (index == nums.length){
            return uno == dos;
        }else if(nums[index] % 5 == 0){
            return split53(index+1, nums, uno + nums[index], dos);
        }else if(nums[index] % 3 == 0){
            return split53(index+1, nums, uno, dos + nums[index]);
        }else {
            return split53(index+1, nums, uno + nums[index], dos) || split53(index+1, nums, uno, dos + nums[index]);
        }
    }


}
