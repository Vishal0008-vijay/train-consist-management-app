import java.util.ArrayList;

public class UC2PassengerBogies {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("Passenger Bogies after addition: " + passengerBogies);

        // Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("After removing AC Chair: " + passengerBogies);

        // Check if Sleeper exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie does not exist.");
        }

        // Final list state
        System.out.println("Final Passenger Bogies: " + passengerBogies);
    }
}
