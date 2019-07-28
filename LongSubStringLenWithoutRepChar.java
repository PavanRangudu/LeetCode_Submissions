class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> hMap = new HashMap<Character, Integer>();
        int max = 0;
        int min = 0;
        int length = 0;
        int curr_len = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            //System.out.println("char : "+c);
            if (hMap.containsKey(c) && hMap.get(c) >= min  && hMap.get(c) <= max) {
                curr_len = max - min + 1;
                if (curr_len > length) {
                    length = curr_len;    
                }
                min = hMap.get(c) + 1;
                max = i;
                hMap.put(c, i);
                //System.out.println("Inside if "+length+"   "+min+"  "+max+"  "+c+"  "+i);
            } else {
                hMap.put(c, i);
                max = i;
                //System.out.println("Inside else "+length+"   "+min+"  "+max+"  "+c+"  "+i);
            }
        }
        curr_len = max - min + 1;
        if (curr_len > length) {
            length = curr_len;    
        }
        return length;
    }
}