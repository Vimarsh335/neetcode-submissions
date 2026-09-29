class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int n1 = s1.length();
        int n2 = s2.length();

        int i=0; int j=0;
        int count = 0;

        // helper array of size 26
        int[] helper = new int[26];

        // fill the helper array with s1 char <ascii, count>
        for (char ch : s1.toCharArray()) {
           helper[ch-'a']++;
        }

        while (i <= j && j < n2) {
         
         // check if it is equal to 0
         if (helper[s2.charAt(j) - 'a'] > 0) {
            count++;
         } 

         // decrement in helper array 
         helper[s2.charAt(j) - 'a']--;

         // shrink the window 
         while ( i<j && j-i+1 > n1) {
          helper[s2.charAt(i) - 'a']++; 
          if (helper[s2.charAt(i) - 'a'] > 0) {
            count--;
          }
          i++;
         }
         
         // if s1 size is equal to count
         if (count == n1) {
            return true;
         }

         j++; 
        } 

        return false;
    }
}
