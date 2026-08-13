class Solution {
    public String[] findRelativeRanks(int[] score) {

        String[] st = new String[score.length];

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        int fi = -1, si = -1, ti = -1;

        for (int i = 0; i < score.length; i++) {
            if (score[i] > first) {
                third = second; ti = si;
                second = first; si = fi;
                first = score[i]; fi = i;
            }
            else if (score[i] > second) {
                third = second; ti = si;
                second = score[i]; si = i;
            }
            else if (score[i] > third) {
                third = score[i]; ti = i;
            }
        }

        if (fi != -1) st[fi] = "Gold Medal";
        if (si != -1) st[si] = "Silver Medal";
        if (ti != -1) st[ti] = "Bronze Medal";

        boolean[] used = new boolean[score.length];
        if (fi != -1) used[fi] = true;
        if (si != -1) used[si] = true;
        if (ti != -1) used[ti] = true;

        for (int rank = 4; rank <= score.length; rank++) {
            int max = Integer.MIN_VALUE, index = -1;

            for (int i = 0; i < score.length; i++) {
                if (!used[i] && score[i] > max) {
                    max = score[i];
                    index = i;
                }
            }

            st[index] = String.valueOf(rank);
            used[index] = true;
        }

        return st;
    }
}