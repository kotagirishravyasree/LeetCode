class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        StringBuilder sb1 = new StringBuilder(s);
        
        if (sb1.toString().equals(goal)) {
            return true;
        }

        int n = sb1.length();

        for (int i = 0; i < n; i++) {

            char first = sb1.charAt(0);
            sb1.deleteCharAt(0);
            sb1.append(first);

            if (sb1.toString().equals(goal)) {
                return true;
            }
        }

        return false;
    }
}