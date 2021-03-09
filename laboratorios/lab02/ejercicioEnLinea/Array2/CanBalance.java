public class CanBalance {
    public boolean canBalance(int[] nums) {
        int left = 0;
        int right;
        for(int i = 0; i < nums.length - 1; i++)
            left += nums[i];
        right = nums[nums.length-1];
        for(int i = nums.length - 2; i > 0; i--)
        {
            if(left == right)
                return true;
            left -= nums[i];
            right += nums[i];
        }
        return (left == right);
    }
}
