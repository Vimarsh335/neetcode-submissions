class Solution {
    public int maxProfit(int[] prices) {
        
        int i = 0;
        int j = 1;
        int ans = 0;

        while(i<prices.length && j<prices.length){
              
              if(prices[i]>=prices[j]){
                 i=j;
                 j++;
              }
              else if(prices[i]<prices[j]){
               ans= Math.max(ans,prices[j]-prices[i]);
                j++;
              }             
        }

     return ans;
        
          }

    }

