public class more4 {
    public boolean more14(int[] nums) {
        int x= 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 1){
                x++;
            }else if(nums[i] == 4){
                x--;
            }
        }
        return (x>0);
    }
}
