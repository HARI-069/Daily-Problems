public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(isAnagram(str1, str2) > 0? "Anagram" : "Not Anagram");
    }

    static int isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) return -1;

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for(int i : freq) {
            if(i != 0)return -1;
        }

        return 1;
    }
}
