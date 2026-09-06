public class codeToRemoveAllWhiteSpacesInString {
    public static void main(String[] args) {
        String name = "hey my name is prateek";
        System.out.print(removeSpaces(name));
    }

    static String removeSpaces(String name) {
        StringBuilder res = new StringBuilder();

        char c;
        for (int i = 0; i < name.length(); i++) {
            c = name.charAt(i);
            if (c != ' ') {
                res.append(c);
            }
        }

        return res.toString();
    }
}
