class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }        
    }
}


/*
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j=1;

        while(j<nums.length){
            if(nums[j]!=0){

             int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i+=1;
                j+=1;
               
            }
            else if (nums[i]+nums[j] == 0){
                j+=1;
                
            }

        }
        for(int k=0; k<nums.length; k++){
            System.out.println(nums[k]);
        }
    }
}
*/