public class EvenOdd {
    public int[] evenOdd(int[] nums) {
        int temp;
        int evenIndex = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] %2==0)
            {
                temp = nums[i];
                nums[i] = nums[evenIndex];
                nums[evenIndex] = temp;
                evenIndex++;

            }
        }
        return nums;
    }

}
