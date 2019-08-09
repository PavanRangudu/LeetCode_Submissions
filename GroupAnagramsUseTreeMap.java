class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        Map<String, List<String>> hMap = new HashMap<String, List<String>>();
        for (int i=0; i<strs.length; i++) {
            String key = getHMapKey(strs[i]);
            List<String> str_list = null;
            if (hMap.containsKey(key)) {
                str_list = hMap.get(key);
            } else {
                str_list = new ArrayList<String>();     
            }
            str_list.add(strs[i]);
            hMap.put(key, str_list);
        }
        
        for (Map.Entry<String, List<String>> entry: hMap.entrySet()) {
            result.add(entry.getValue());
        }
        
        return result;
    }
    
    private String getHMapKey(String str) {
        Map<Character, Integer> hMap = new TreeMap<Character, Integer>();
        
        for(int i=0; i<str.length();i++) {
            char c = str.charAt(i);
            if (hMap.containsKey(c)) {
                hMap.put(c, hMap.get(c)+1);
            } else {
                hMap.put(c, 1);
            }
        }
        
        return hMap.toString();
    }
}