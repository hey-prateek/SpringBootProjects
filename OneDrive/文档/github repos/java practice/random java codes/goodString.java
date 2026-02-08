// Given a string s, return true if s is a "good" string, or false otherwise.
// A string s is good if all characters that appear in s have the same number of
// occurrences (i.e., the same frequency).

public class goodString {
    public static void main(String[] args) {
        String str = "aabbbccdd";
        String str1 = "aabbccdd";

        System.out.println(checkGoodString(str));
        System.out.println(checkGoodString(str1));
    }

    static Boolean checkGoodString(String str) {
        // create array of 26 size
        // increment index just as u travers the string
        // check if there diff values in that array, except 0

        int[] res = new int[26];
        for (char c : str.toCharArray()) {
            res[c - 'a']++;
        }

        int count = 0, match = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i] > 0 && count == 0) {
                count++;
                match = res[i];
            }

            if (res[i] != match && res[i] != 0)
                return false;
        }

        return true;
    }
}
