
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> hmS = new HashMap<>();
        Map<Character, Character> hmT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (hmS.containsKey(a) && hmS.get(a) != b) {
                return false;
            }
            if (hmT.containsKey(b) && hmT.get(b) != a) {
                return false;
            }
            hmS.put(a, b);
            hmT.put(b, a);
        }
        return true;
    }
}
