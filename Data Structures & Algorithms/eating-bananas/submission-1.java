class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       
       
       int minspeed = 1;
       int maxspeed = -1;

       for(int i=0;i<piles.length;i++){
               maxspeed = Math.max(maxspeed,piles[i]);               
       }
        

       while(minspeed<=maxspeed){
             int mid = (minspeed + maxspeed)/2;
             long hours = 0;
             for(int p:piles){
                hours = hours + (p + mid - 1) / mid;
             }
             
             if(hours>h){                 
                 minspeed = mid+1;
             }
             else{
                maxspeed = mid-1;
             }
       }
 return minspeed;
       
    }
}
