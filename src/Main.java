import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("This generator will generate a couple/ship name for two people you think will be good together!");
        System.out.println("After that, it will tell you how compatible they are!");
        System.out.println("Btw this ship name generator is a prototype and might generate an... interesting name.");
        System.out.println("In the case of this event, have fun with figuring out the pronunciation!");
        System.out.print("Enter first person's name here (Preferably capitalized): ");
        String firstName = s.nextLine();
        System.out.print("Enter second person's name here (Preferably capitalized): ");
        String secondName = s.nextLine();
        Shipping shipName = new Shipping();
        System.out.println(shipName.shipNameGenerator(firstName, secondName));
        System.out.println(shipName.compatibilityPercent(firstName, secondName));
        System.out.println("How bout another ship? If you're ready to go write some fanfics or draw fanart (or you just want to quit in general), type 'Stop Ship' If you want to keep generating ship names press enter.");
        while (!s.nextLine().equals("Stop Ship")) {
            System.out.print("Enter first person's name here (Preferably capitalized): ");
            firstName = s.nextLine();
            System.out.print("Enter second person's name here (Preferably capitalized): ");
            secondName = s.nextLine();
            System.out.println(shipName.shipNameGenerator(firstName, secondName));
            System.out.println(shipName.compatibilityPercent(firstName, secondName));
            System.out.println("How bout another ship? If you're ready to go write some fanfics or draw fanart (or you just want to quit in general), type 'Stop Ship' If you want to keep generating ship names press enter.");
        }
       System.out.println("Stopping ship! Bye bye!");
    }
}
