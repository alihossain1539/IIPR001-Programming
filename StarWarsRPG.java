import java.util.Scanner;

public class StarWarsRPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jedi jedi = new Jedi("Shaon Skywalker", 100);
        Sith sith = new Sith("Rana Vader", 120);

        System.out.println("Welcome to the Star Wars RPG!");
        System.out.println("Choose your character: (1) Jedi or (2) Sith");
        int choice = sc.nextInt();

        if (choice == 1) {
            jedi.activateLightSaber();
        } else if (choice == 2) {
            sith.useForce();
        } else {
            System.out.println("Invalid choice.");
        }

        while (jedi.getHealth() > 0 && sith.getHealth() > 0) {
            System.out.println("Choose your action: (1) Attack or (2) Defend");
            int action = sc.nextInt();

            if (action == 1) {
                jedi.attack();
                sith.takeDamage(20);
                sith.attack();
                jedi.takeDamage(15);
            } else if (action == 2) {
                // Implement defend logic here
            } else {
                System.out.println("Invalid action.");
            }
        }

        // Game over
        if (jedi.getHealth() <= 0) {
            System.out.println("Darth Vader wins!");
        } else {
            System.out.println("Luke Skywalker wins!");
        }

        sc.close();
    }
}
