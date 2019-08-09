class MyHashSet {

    private List<List<Integer>> hashSet;
    /** Initialize your data structure here. */
    public MyHashSet() {
        // Cant have Array of Parameterized Types
        hashSet = new ArrayList<List<Integer>>();
        for (int i=0; i<10000; i++){
            hashSet.add(i, new ArrayList<Integer>());
        }
    }
    
    public void add(int key) {
        if (!contains(key)) {
            int hashedKey = hashFunc(key);
            hashSet.get(hashedKey).add(key);
            //System.out.println("hashSet list at idx "+hashedKey+" is "+hashSet.get(hashedKey).toString());
        }
        
    }
    
    public void remove(int key) {
        if (contains(key)) {
            int hashedKey = hashFunc(key);
            hashSet.get(hashedKey).remove(new Integer(key));
            //System.out.println("hashSet list at idx "+hashedKey+" is "+hashSet.get(hashedKey).toString());
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int hashedKey = hashFunc(key);
        List<Integer> temp = hashSet.get(hashedKey);
        //System.out.println("Temp found "+temp.toString()+" key "+key+" hkey"+hashedKey);
        if (temp.isEmpty()) {
            return false;
        }
        
        
        if (temp.contains(key)) {
            return true;
        } else {
            return false;
        }
    }
    
    private int hashFunc(int key) {
        return key % 10000;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */