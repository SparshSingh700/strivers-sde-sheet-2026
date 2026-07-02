/*
Question Link:
https://leetcode.com/problems/valid-anagram/

Question:
Return true if two strings
are anagrams of each other.
*/

class Solution {

    /*
        Count frequency of every character.

        Increase count for first string.
        Decrease count for second string.

        If every frequency becomes zero,
        both strings are anagrams.
    */
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int count : freq) {
            if(count != 0) {
                return false;
            }
        }

        return true;
    }

    /*
    =====================================================
        Alternative Approach (Works for all characters)
    =====================================================

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : t.toCharArray()) {

            if(!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if(map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }
    */
}