import java.util.*;

public class Next_Permutation {
    
    public void nextPermutation(int[] nums) {
        int larger = 0;
        for(int i=nums.length-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                larger = i-1;
                break;
                
            }
            else if(i==1){
                larger = -1;
            }
        }
        if(larger==-1){
            Arrays.sort(nums);
            return;
        }
        else{
            for(int i=nums.length-1; i>0; i--){
                if(nums[i]>nums[larger]){
                    int temp = nums[i];
                    nums[i] = nums[larger];
                    nums[larger] = temp;
                    break;
                }
            }
            Arrays.sort(nums, larger+1, nums.length);
            return;
        }
        
    }
    
}


