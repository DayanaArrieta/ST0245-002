/**
 * This class choose a group of some of the ints in the array
 * such that the group sums to the given target with these additional constraints:
 * all multiples of 5 in the array must be included in the group
 * if the value immediately following a multiple of 5 is 1, it must not be chosen
 * @author: Dayana Arrieta & Juan José Quintana.
 * @version: 26/02/2021
 */
public class GroupSum5 {
    public boolean groupSum5(int start, int[] nums, int target) {

        if(start == nums.length){
            return (target == 0);
        }

        if(nums[start]%5 == 0){
            if(start < nums.length-1){
                if(nums[start+1] == 1)
                    return groupSum5(start+2, nums, target-nums[start]);
            }
            return groupSum5(start+1, nums, target-nums[start]);
        }

        if(target == 0)
            return true;

        return groupSum5(start+1, nums, target-nums[start]) || groupSum5(start+1, nums, target);
    }
}
