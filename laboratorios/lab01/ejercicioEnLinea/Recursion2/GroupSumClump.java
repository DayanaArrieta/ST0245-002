/**
 * This class choose a group of some of the ints in the array
 * such that the group sums to the given target with these additional constraint:
 * if there are numbers in the array that are adjacent and the identical value
 * they must either all be chosen, or none of them chosen
 * @author: Dayana Arrieta & Juan José Quintana.
 * @version: 26/02/2021
 */
public class GroupSumClump {
    public boolean groupSumClump(int start, int[] nums, int target)
    {
        if(start >= nums.length)
        {
            if(target == 0)
                return true;
            return false;
        }
        int i = start + 1;
        for(;  i < nums.length && nums[start] == nums[i]; i++);
        if(groupSumClump(i, nums, target - ((i - start) * nums[start])))
            return true;
        return groupSumClump(i, nums, target);
    }
}
