package all_combined;
//Chain Functions to transform a sentence: lowercase → remove punctuation → split into words → count words

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class code3 {
    public static void main(String[] args) {
        String str = "Prateek! Beats, Punith; In Every: Physical Match";
        Function<String, String> func = String::toLowerCase;
        Function<String, String> func1 = s -> {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                        || s.charAt(i) == ' ')
                    res.append(s.charAt(i));
            }
            return res.toString();
        };
        Function<String, List<String>> func2 = s -> {
            List<String> strr = new ArrayList<>(Arrays.asList(s.split("\\s+")));
            return strr;
        };
        Function<List<String>, Integer> func3 = s -> s.size();
        System.out.println(func.andThen(func1).andThen(func2).andThen(func3).apply(str));
    }
}
