import java.util.HashMap;

class CountNumberOfWordsInStringUsingHashmap {
    public static void main(String[] args) {
        String str = "hi i am prateek am";
        int res = 0;

        HashMap<String, Integer> hmap = new HashMap<>();

        String[] strarr = str.split("\\s");

        for (int i = 0; i < strarr.length; i++) {
            if (!hmap.containsKey(strarr[i])) {
                res++;
                hmap.put(strarr[i], 1);
            }
        }
        System.out.println(res);

    }
}