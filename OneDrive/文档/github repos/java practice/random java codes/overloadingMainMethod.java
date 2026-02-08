public class overloadingMainMethod {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }

        main(new int[] { 10, 20, 30 });
    }

    public static void main(int[] args) {
        int res = 0;
        for (int s : args) {
            res += s;
        }
        System.out.println(res);
    }
}