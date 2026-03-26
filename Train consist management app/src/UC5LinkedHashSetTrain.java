import java.util.LinkedHashSet;

public class UC5LinkedHashSetTrain {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate intentionally
        train.add("Sleeper"); // duplicate (will be ignored)

        // Display final formation
        System.out.println("Train Formation (Ordered & Unique): " + train);
    }
}
