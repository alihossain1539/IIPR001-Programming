public class Jedi {
    private String name;
    private int health;
    private boolean isLightSaberOn;

    // Constructor
    public Jedi(String name, int health) {
        this.name = name;
        this.health = health;
        this.isLightSaberOn = false;
    }

    // Methods
    public void activateLightSaber() {
        isLightSaberOn = true;
        System.out.println(name + " activates their lightsaber!");
    }

    public void attack() {
        if (isLightSaberOn) {
            System.out.println(name + " attacks with the lightsaber.");
        } else {
            System.out.println(name + " tries to attack but the lightsaber is off.");
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage.");
        System.out.println(name + " health remain " + health + ".");
    }

    public int getHealth() {
        return health;
    }
}
