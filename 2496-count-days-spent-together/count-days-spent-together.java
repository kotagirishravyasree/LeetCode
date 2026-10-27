import java.util.*;

class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {

        int[] days = {31, 28, 31, 30, 31, 30, 
                      31, 31, 30, 31, 30, 31};

        int start1 = convert(arriveAlice, days);
        int end1 = convert(leaveAlice, days);
        int start2 = convert(arriveBob, days);
        int end2 = convert(leaveBob, days);

        int start = Math.max(start1, start2);
        int end = Math.min(end1, end2);

        if (start > end) {
            return 0;
        }

        return end - start + 1;
    }

    public int convert(String date, int[] days) {
        String[] parts = date.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        int total = day;

        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }

        return total;
    }
}