class Solution {
    public boolean isAnagram(String s, String t) {
         int[] sc = new int[26];
         
          if(s.length()!=t.length()){
            return false;
          }

         for(int i=0;i<s.length();i++){
            sc[s.charAt(i)-'a']++;
            sc[t.charAt(i)-'a']--;
         }

         for(int i=0;i<sc.length;i++){
            if(sc[i]!=0){
                return false;
            }
         }

         return true;
    }
}
