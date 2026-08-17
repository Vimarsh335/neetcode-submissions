class Solution {

    public String encode(List<String> strs) {
           String s = "";
              
               for(int i=0;i<strs.size();i++){
                    s = s+strs.get(i)+"€";
               }
           
           System.out.println(s);
            return s;
    }

    public List<String> decode(String str) {
         
          List<String> ls = new ArrayList<>();
             String hlp = "";
          for(int i=0;i<str.length();i++){
            
              if(str.charAt(i)=='€'){
                   ls.add(hlp);
                   hlp = "";
              }
              else{
                hlp = hlp + str.charAt(i);
              }
          }
          return ls;
    }
}
