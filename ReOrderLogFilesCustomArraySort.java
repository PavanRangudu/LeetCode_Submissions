class Solution {
    public String[] reorderLogFiles(String[] logs) {
        
        // Custom solution
        Arrays.sort(logs, (l1, l2) -> {
           String[] split1 = l1.split(" ", 2); // Splits only once - into 2 parts
           String[] split2 = l2.split(" ", 2);
           
           Boolean isSplit1DigitLog = Character.isDigit(split1[1].charAt(0));
           Boolean isSplit2DigitLog = Character.isDigit(split2[1].charAt(0));
            
           if (!isSplit1DigitLog && !isSplit2DigitLog) {
               int cmp = split1[1].compareTo(split2[1]);
               if (cmp == 0) {
                   return split1[0].compareTo(split2[0]); 
               }
               return cmp;
           }
            
           return isSplit1DigitLog ? (isSplit2DigitLog ? 0 : 1) : -1;
        });
        
        return logs;
    }
}