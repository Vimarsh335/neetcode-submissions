class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int i=0;
        int j=0;
        int count =0;
        int [] helper = new int[26];

        for(int k= 0;k<s1.length();k++){
          helper[s1.charAt(k)-'a'] = helper[s1.charAt(k)-'a']+1; 
        }

        while(i<=j && j<s2.length()){               

              if(helper[s2.charAt(j)-'a']>0){
                  count++;
              } 

              helper[s2.charAt(j)-'a']--;

              if(i<j && j-i+1>s1.length()){
                 helper[s2.charAt(i)-'a']++;
                 if(helper[s2.charAt(i)-'a']>0){
                        count--;
                 }                 
                 i++;    
              }
              if(count==s1.length()){
               return true;
              }
              j++;
           
        }
        
    return false;

  }
}
