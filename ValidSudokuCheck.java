class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> hSet = new HashSet<Character>();
        
        // Row Checking
        for(int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                char c = board[i][j];
                if (c != '.') { 
                    if (hSet.contains(c)) {
                        return false;
                    } else {
                        hSet.add(c);
                    }
                }
            }
            hSet.clear();
        }
        
        // Column Checking
        for(int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                char c = board[j][i];
                if (c != '.') { 
                    if (hSet.contains(c)) {
                        return false;
                    } else {
                        hSet.add(c);
                    }
                }
            }
            hSet.clear();
        }
        
        // Box checking 
        for (int b=0; b<9; b++) {
            int i_s = 0;
            int j_s = 0;
            switch(b) {
                case 0: {
                    i_s = 0;
                    j_s = 0;
                    break;
                }
                case 1: {
                    i_s = 0;
                    j_s = 3;
                    break;
                }
                case 2: {
                    i_s = 0;
                    j_s = 6;
                    break;
                }
                case 3: {
                    i_s = 3;
                    j_s = 0;
                    break;
                }
                case 4: {
                    i_s = 3;
                    j_s = 3;
                    break;
                }
                case 5: {
                    i_s = 3;
                    j_s = 6;
                    break;
                }
                case 6: {
                    i_s = 6;
                    j_s = 0;
                    break;
                }
                case 7: {
                    i_s = 6;
                    j_s = 3;
                    break;
                }
                case 8: {
                    i_s = 6;
                    j_s = 6;
                    break;
                }
                default: {
                    i_s = 0;
                    j_s = 0;
                    break;
                }
                
            }
            for(int i=i_s; i<i_s+3; i++) {
                for (int j=j_s; j<j_s+3; j++) {
                    char c = board[i][j];
                    if (c != '.') { 
                        if (hSet.contains(c)) {
                            return false;
                        } else {
                            hSet.add(c);
                        }
                    }
                }
            }
            hSet.clear();
        }
        
        return true;
    }
}