class Solution {

    class pair{
          int a;
          int b;

         pair(int a,int b){
            this.a = a;
            this.b = b;
         }

    }
    public int[] dailyTemperatures(int[] temperatures) {

                 int [] ans = new int[temperatures.length];
                
                 Stack<pair> st = new Stack<>();
                  
                 st.push(new pair(0,temperatures[0]));

                  for(int i=1; i<temperatures.length;i++){

                      while(!st.isEmpty() && st.peek().b < temperatures[i]){
                          pair p = st.pop();
                          ans[p.a] = i-p.a;                            
                      }
                      st.push(new pair(i,temperatures[i]));                          
                  }
        return ans;
    }
}
