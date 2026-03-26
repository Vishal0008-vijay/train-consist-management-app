import java.util.*;
import java.util.stream.Collectors;

// Bogie class (same as UC7 & UC8)
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UC9GroupBogies {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 54));

        // Group bogies by type (name)
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped result
        System.out.println("Grouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().size() + " bogies");
        }

        // Verify original list unchanged
        System.out.println("Original List Size: " + bogies.size());
    }
}
