class Solution {
    public int maxArea(int[] heights) {
        

        int a = 0 ;
        int b = heights.length-1;
        int max = -1;

        while(a<b){
            max=Math.max(max,(b-a)*Math.min(heights[a],heights[b]));
            if(heights[a]>heights[b]){
                b--;
            }
            else if(heights[a]<heights[b]){
                a++;
            }
            else if (heights[a]==heights[b]){
                  if(heights[a+1]>heights[b-1]){
                    a++;
                  }
                  else {
                    b--;
                  }
            } 
        }

        return max;
    }
}
