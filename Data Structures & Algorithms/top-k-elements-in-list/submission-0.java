class Solution {

    class pair implements Comparable<pair>{
        int a;
        int b;

        pair(int a, int b){
            this.a = a;
            this.b = b;
        }

        public int compareTo(pair p){
            return p.b-this.b;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hm =new HashMap<>();

        for(int i=0; i<nums.length;i++){
             if(hm.containsKey(nums[i])){
                int a = hm.get(nums[i]);
                a=a+1;
                hm.put(nums[i],a);
             }
             else{
                hm.put(nums[i],1);
             }
        }
        
        Queue <pair> pq = new PriorityQueue<>();
       for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            pq.add(new pair(entry.getKey(),entry.getValue()));
       }
       int [] ans = new int[k];

       while(k!=0){
        ans[ans.length-k]=pq.poll().a;
        k--;
       }
       return ans;
    }
}
