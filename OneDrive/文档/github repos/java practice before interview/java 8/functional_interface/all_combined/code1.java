package all_combined;

//Read a file line by line → filter lines using Predicate → transform using Function → print using Consumer

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class code1 {
    public static void main(String[] args) {
        try (BufferedReader bread = new BufferedReader(new FileReader(
                "C:\\Users\\prate\\OneDrive\\文档\\java_8_codes\\functional_interface\\all_combined\\temp.txt"))) {

            List<String> flst = new ArrayList<>();
            String line = "";
            while ((line = bread.readLine()) != null) {
                flst.add(line);
            }
            Predicate<String> pred = s -> s.contains("hey");

            Function<String, String> func = s -> s.toUpperCase();

            Consumer<String> cons = s -> System.out.println(s);

            flst.stream().filter(pred).map(func).forEach(cons);

        } catch (IOException e) {
            e.getMessage();
        }
    }
}