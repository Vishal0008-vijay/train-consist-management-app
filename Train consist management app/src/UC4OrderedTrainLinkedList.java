import java.util.LinkedList;

public class UC4OrderedTrainLinkedList {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Display initial consist
        System.out.println("Initial Train Consist: " + train);

        // Insert Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("After adding Pantry at position 2: " + train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Final consist
        System.out.println("Final Train Consist: " + train);
    }
}
