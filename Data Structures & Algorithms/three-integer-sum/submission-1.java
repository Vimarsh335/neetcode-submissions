class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
           Set<List<Integer>> ans = new HashSet<>();
           Arrays.sort(nums);
           
          

          for(int i=0;i<nums.length;i++){
             int strt = 0;
             int end = nums.length-1;
              while(strt<end){
                if(i==strt){
                    break;
                }
                else if(i==end){
                   break;
                }
                else if(nums[strt]+nums[end]+nums[i]>0){
                     end--; 

                }
                else if(nums[strt]+nums[end]+nums[i]<0){
                     strt++;

                }
                else{
                List<Integer> ls = new ArrayList<>();
                     ls.add(nums[strt]);
                     ls.add(nums[i]);
                     ls.add(nums[end]);
                     ans.add(ls);
                       strt++;
                       end--;
                }
              }              
          }
         return new ArrayList<>(ans);
    }
}
