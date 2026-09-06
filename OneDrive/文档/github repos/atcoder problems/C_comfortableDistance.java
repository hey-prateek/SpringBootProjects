import java.util.Scanner;

public class C_comfortableDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // length of string
        int L = sc.nextInt(); // minimum distance
        int R = sc.nextInt(); // maximum distance
        String S = sc.next();

        long ans = 0;

        int[] freq = new int[26];
        // frequency array to store characters in valid window

        for (int j = 0; j < N; j++) {

            // add new index entering window
            // position j-L becomes valid start
            if (j - L >= 0) {
                char ch = S.charAt(j - L);
                freq[ch - 'a']++;
            }

            // remove index leaving window
            // position j-R-1 becomes invalid
            if (j - R - 1 >= 0) {
                char ch = S.charAt(j - R - 1);
                freq[ch - 'a']--;
            }

            // count how many previous characters equal to S[j]
            ans += freq[S.charAt(j) - 'a'];
        }

        System.out.println(ans);
    }
}
