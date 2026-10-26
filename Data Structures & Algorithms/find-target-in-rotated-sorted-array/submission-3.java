class Solution {
    public int search(int[] nums, int target) {
        
        int mid = 0;
        int strt = 0;
        int end = nums.length-1;

        while(strt<=end){
            mid = strt+(end-strt)/2;
             if(nums[mid]==target){
                return mid;
             } 
             if(nums[mid]<nums[end]){
                  if(nums[mid]<target && nums[end]>=target){
                          strt = mid+1;        
                  } 
                  else{                     
                     end = mid;
                  }        
             }  
             else {
                 if(nums[mid]>target && nums[strt]<=target){
                          end = mid;        
                  } 
                  else{                     
                     strt = mid+1;
                  }        

             }
           
        }
        if(nums[mid]!=target){
            return -1;
        }
        return mid;
    }
}
