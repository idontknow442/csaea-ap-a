
public class Dog {
    
    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel;

    public Dog(String name, String ownerName, String breed) {
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;

        age = 0;
        weight = 0.0;
        isHungry = true;
        isHome = true;
        energyLevel = 100;

    }

    public void eat() {
        isHungry = false;
        energyLevel += 25;
        if (energyLevel > 100){
            energyLevel = 100;
        }
    }

    public void play() {
        energyLevel -= 10;
        if (energyLevel < 0){
            energyLevel = 0;
        }
    }

    public void birthday() {
        age += 1;
    }

    public void goHome() {
        isHome = true;
    }

    public void sleep() {
        energyLevel += 50;
        if (energyLevel > 100){
            energyLevel = 100;
        }
    }

    public void runAway() {
        isHome = false;
        energyLevel -= 20;
        if (energyLevel < 0){
            energyLevel = 0;
        }
    }

}
