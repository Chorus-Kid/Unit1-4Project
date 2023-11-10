import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Shipping shipName = new Shipping();
        System.out.println("This generator will generate a couple/ship name for two people you think will be good together!");
        System.out.println("After that, it will tell you how compatible they are!");
        System.out.println("Btw this ship name generator is a prototype and might generate an... interesting name.");
        System.out.println("In the case of this event, have fun with figuring out the pronunciation!");
        System.out.print("Enter first person's name here (Preferably capitalized): ");
        String firstName = s.nextLine();
        System.out.print("Enter second person's name here (Preferably capitalized): ");
        String secondName = s.nextLine();
        System.out.println(shipName.shipNameGenerator(firstName, secondName));
        System.out.println(shipName.compatibilityPercent(firstName, secondName));
    }
}
