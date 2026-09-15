package CrashCourse;

public class MyKnight {
    
    String characterName;
    int health;
    boolean isSafeZone;
    int weaponDurability;
    int staminaAmount;
    int age;
    int armorDurability;
    boolean isRunning;
    String weaponChoice;

    public MyKnight(String characterName, int age, String weaponChoice) {

        this.characterName = characterName;
        this.age = age;
        this.weaponChoice = weaponChoice;

        health = 100;
        isSafeZone = true;
        weaponDurability = 100;
        staminaAmount = 100;
        armorDurability = 100;
        isRunning = false;

    }

    public void run() {
        isRunning = true;
        staminaAmount -= 10;
        if (staminaAmount < 0){
            staminaAmount = 0;
        }
    }

    public void attack() {
        weaponDurability -= 2;
        if (weaponDurability < 0){
            weaponDurability = 0;
        }
    }

    public void getsHit() {
        health -= 10;
        if (health < 0) {
            health = 0;
        }
        armorDurability -= 2;
        if (armorDurability <0) {
            armorDurability = 0;
        }
    }
    
    public void haveBirthday() {
        age += 1;
    }

    public void stopsRunning() {
        isRunning = false;
    }

    public void leaveSafeZone() {
        isSafeZone = false;
    }

    public void enterSafeZone() {
        isSafeZone = true;
    }



}
