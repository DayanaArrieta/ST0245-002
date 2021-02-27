/**
 * This class divide the ints of the array into two groups
 * so that the sum of one group is a multiple of 10
 * and the sum of the other group is odd. Every int must be in one group or the other.
 * @author: Dayana Arrieta & Juan José Quintana.
 * @version: 26/02/2021
 */
public class SplitOdd10 {
    public boolean splitOdd10(int[] nums) {
        return splitOdd10(0, nums, 0, 0);
    }

    public boolean splitOdd10(int index, int[] nums, int uno, int dos) {
        if (index == nums.length){
            return uno%10 == 0 && dos%2 > 0;
        }
        return splitOdd10(index+1, nums, uno+nums[index], dos) || splitOdd10(index+1,nums, uno, dos+nums[index]);
    }
}
