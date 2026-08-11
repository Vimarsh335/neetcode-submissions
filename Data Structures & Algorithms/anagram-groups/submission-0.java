class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hm =new HashMap<>();

        for(int i=0;i<strs.length;i++){
              char [] c = strs[i].toCharArray();
              Arrays.sort(c);
              
              String val = new String(c);
               if(hm.containsKey(val)){
                  hm.get(val).add(strs[i]);
               }
               else{
                List<String> ls =new ArrayList<>();
                ls.add(strs[i]);
                hm.put(val,ls);
               }
        }
      
      List<List<String>> lm = new ArrayList<>();
       for (List<String> list : hm.values()) {
           lm.add(list);
        }

        return lm;
    }
}
