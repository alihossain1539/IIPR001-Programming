public class Sith {
    private String name;
    private int health;
    private int darkSidePower;

    // Constructor
    public Sith(String name, int health) {
        this.name = name;
        this.health = health;
        this.darkSidePower = 50;
    }

    // Methods
    public void useForce() {
        if (darkSidePower >= 20) {
            darkSidePower -= 20;
            System.out.println(name + " uses the dark side of the Force!");
        } else {
            System.out.println(name + " doesn't have enough dark side power.");
        }
    }

    public void attack() {
        System.out.println(name + " attacks with the Force.");
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage.");
    }
    
    public int getHealth() {
        return health;
    }
}
