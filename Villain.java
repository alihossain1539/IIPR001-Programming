public class Villain {
    private String name;
    private int health;

    // Constructor
    public Villain(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Methods

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage.");
        System.out.println(name + " health remain " + health + ".");
    }
    
    public int getHealth() {
        return health;
    }
}
