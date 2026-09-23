
public class MyKnight {
    
    private String characterName;
    private int health;
    private boolean isSafeZone;
    private int weaponDurability;
    private int staminaAmount;
    private int age;
    private int armorDurability;
    private  boolean isRunning;
    private String weaponChoice;
    private double attackPower;
    

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
        attackPower = 20.0;

    }

    public void run() {
        isRunning = true;
        staminaAmount -= 10;
        if (staminaAmount < 0){
            staminaAmount = 0;
        } else {
            isRunning = false;
        }
    
    } 

    public void attack() {
        weaponDurability -= 2;
        if (weaponDurability < 0){
            weaponDurability = 0;
        System.out.println(characterName + " attacked with " + weaponChoice);
        } if (weaponDurability < 50) {
            attackPower -= 10.0;
        }else {
            System.out.println(characterName = "', weapon broke");
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

    public void heal(int amount) {
        if(amount > 0) {
            health += amount;
        } if(health > 100) {
            health = 100;
        } else {
            System.out.println("The healing amount must be positive");
        }
    }


}
