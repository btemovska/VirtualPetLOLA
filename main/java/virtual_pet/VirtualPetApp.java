package virtual_pet;

import java.util.Scanner;

public class VirtualPetApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        VirtualPet lola = new VirtualPet(10, 8, 50, 0, 0);

        System.out.println("Hello! This is Lola, your virtual pet");
        System.out.println("   *            *    ");
        System.out.println("  * *          * *   ");
        System.out.println(" *   **********   *  ");
        System.out.println(" *                *  ");
        System.out.println(" *   **       **  *  ");
        System.out.println("  *  **      **  *   ");
        System.out.println("  *     ****    *    ");
        System.out.println("   *   ******  *     ");
        System.out.println("     *       *       ");
        System.out.println("     **********      ");
        System.out.println("     *        *      ");
        System.out.println("    *          *     ");
        System.out.println("    *  *    *  *     ");
        System.out.println("    *  *    *  *     ");
        System.out.println("    ************     ");

        System.out.println("What would you like to do with Lola?");
        System.out.println("1 to feed Lola");
        System.out.println("2 to give Lola a drink");
        System.out.println("3 to play with Lola");
        System.out.println("4 put Lola to sleep");
        System.out.println("5 to check Lola's status");
        System.out.println("6 to exit");
        String menuOption = input.nextLine();

        while (!menuOption.equals("6")) {

            if (menuOption.equals("1")) {
                System.out.println("Enter the amount you want to feed Lola");
                int feed = input.nextInt();
                lola.feed(feed);
                input.nextLine();
            } else if (menuOption.equals("2")) {
                System.out.println("Enter the number of glasses to give Lola");
                int drink = input.nextInt();
                lola.drink(drink);
                input.nextLine();
            } else if (menuOption.equals("3")) {
                System.out.println("Enter the minutes you want to play with Lola");
                int play = input.nextInt();
                lola.play(play);
                lola.tick(play);
                input.nextLine();
            } else if (menuOption.equals("4")) {
                System.out.println("Enter the minutes you want to let lola Sleep");
                int sleep = input.nextInt();
                lola.sleep(sleep);
                input.nextLine();
            } else if (menuOption.equals("5")) {
                System.out.println("Hunger: " + lola.getHunger());
                System.out.println("Thirst: " + lola.getThirst());
                System.out.println("Bored: " + lola.getBored());
                System.out.println("Tired: " + lola.getTired());
            } else {
                System.out.println("Ciao");
                System.exit(0);
            }
            System.out.println("What would you like to do with Lola?");
            System.out.println("1 to feed Lola");
            System.out.println("2 to give Lola a drink");
            System.out.println("3 to play with Lola");
            System.out.println("4 put Lola to sleep");
            System.out.println("5 to check Lola's status");
            System.out.println("6 to exit");
            menuOption = input.nextLine();
        }
        System.out.println("Ciao");
    }
}
