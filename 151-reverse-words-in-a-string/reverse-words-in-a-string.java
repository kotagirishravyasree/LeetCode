class Solution {
    public static String reverseWords(String s) {

        StringBuilder s1 = new StringBuilder(s);

        // Remove leading spaces
        while (s1.length() > 0 && s1.charAt(0) == ' ') {
            s1.deleteCharAt(0);
        }

        // Remove trailing spaces
        while (s1.length() > 0 && s1.charAt(s1.length() - 1) == ' ') {
            s1.deleteCharAt(s1.length() - 1);
        }

        String s2 = s1.toString();

        StringBuilder sb = new StringBuilder();

        int i = s2.length() - 1;
        int j = s2.length() - 1;

        while (j >= 0) {
            if (s2.charAt(j) != ' ') {
                j--;
            } else {
                // Append the current word
                sb.append(s2.substring(j + 1, i + 1));

                // Skip all consecutive spaces
                while (j >= 0 && s2.charAt(j) == ' ') {
                    j--;
                }

                // Add only one space if another word exists
                if (j >= 0) {
                    sb.append(' ');
                }

                i = j;
            }
        }

        // Append the first word
        sb.append(s2.substring(0, i + 1));

        return sb.toString();
    }
}