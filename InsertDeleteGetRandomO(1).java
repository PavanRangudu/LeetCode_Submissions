

class RandomizedSet {
    
    private Map<Integer, Integer> hMap;
    private List<Integer> keyList;
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
        hMap = new HashMap<Integer, Integer>();
        keyList = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (hMap == null || hMap.containsKey(val)) {
            return false;
        }
        hMap.put(val, val);
        keyList.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (hMap != null && hMap.containsKey(val)) {
            hMap.remove(val);
            keyList.remove(new Integer(val));
            //System.out.println("Removed val"+val);
            return true;
        }
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        
        //System.out.println("hMap"+hMap.toString()+"keylist"+keyList.toString());
        int rand = (int)(Math.random() * keyList.size());
    
        int randKey = keyList.get(rand);
        //System.out.println("randKey "+randKey+" size "+keyList.size());
        if (hMap.containsKey(randKey)) {
            return hMap.get(randKey);
        } else {
            return 0;
        }
            
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */