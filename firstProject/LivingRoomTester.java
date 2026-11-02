package firstProject;

public class LivingRoomTester {
    public static void main(String[] args) {
        LivingRoom room1 = new LivingRoom("Alice.Smith", 200.0);
        LivingRoom room2 = new LivingRoom("Bob.Jones", 150.0);
        LivingRoom room3 = new LivingRoom("Charlie.Brown", 300.0);

        System.out.println("Expected: Owner: Alice.Smith, Seating: 5 seats, Size: 200.0 sq ft, Organized: true");
        System.out.println("Got: " + room1.toString());

        System.out.println("Expected: true  , Got: " + room1.isCorrectOwner("Alice.Smith"));
        System.out.println("Expected: false , Got: " + room1.isCorrectOwner("Bob.Jones"));
        
        room1.messRoom();
        System.out.println("Expected: Owner: Alice.Smith, Seating: 5 seats, Size: 200.0 sq ft, Organized: false");
        System.out.println("Got: " + room1.toString());
        room1.cleanRoom();

        System.out.println("Expected: true  , Got: " + room1.checkFirstName("Ali"));
        System.out.println("Expected: false , Got: " + room1.checkFirstName("Zack"));
        System.out.println("Expected: true  , Got: " + room2.checkFirstName("Bob"));
        System.out.println("Expected: false , Got: " + room2.checkFirstName("Alice"));

        System.out.println("Expected: 300.0 , Got: " + room1.calculateCleaningCost(1.50));
        System.out.println("Expected: 600.0 , Got: " + room3.calculateCleaningCost(2.00));
    }
}