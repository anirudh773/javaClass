class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
        return false;
        }
        int [] f = new int[26];
        
        for(char z: s.toCharArray()){
            f[z-'a']++;
        }
        for(char z: t.toCharArray()){
            f[z-'a']--;
        }
        for(int i=0;i<26;i++){
            if(f[i]!=0){
                return false;
            }
        }
        return true;
    }   
        
}