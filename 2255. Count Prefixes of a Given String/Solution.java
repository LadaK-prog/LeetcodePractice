class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;

   
    for(String word : words) {
        if(word.length() > s.length()) {
            continue;
        }
            boolean prefix = true;
            
            for(int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != s.charAt(i)) {
                    prefix = false;
                    break;
                }
    }
    if(prefix) {
                count++;
            }
        
            }
            
            return count;
        }
}
