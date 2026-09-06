import java.util.*;
import java.util.function.Consumer;
import java.time.LocalTime;
import java.io.FileWriter;
import java.io.IOException;

public class code20_PrintEventsWithTimestamp {

    public static void main(String[] args) {

        // List of system events
        List<String> systemEvents = Arrays.asList("Update", "Shut down", "Restart", "Reboot");

        // Capture current time once for consistent timestamp
        LocalTime timestamp = LocalTime.now();

        // Consumer to print event with timestamp
        Consumer<String> printEvent = event -> 
            System.out.println(event + " -> " + timestamp);

        // Consumer to log event to a file
        Consumer<String> logToFile = event -> {
            try (FileWriter fw = new FileWriter("temp.txt", true)) { // true = append mode
                fw.write(event + System.lineSeparator());
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        };

        // Combine both consumers: first print, then log to file
        Consumer<String> combinedConsumer = printEvent.andThen(logToFile);

        // Process each event
        systemEvents.forEach(combinedConsumer);
    }
}
