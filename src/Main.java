import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Shipping shipName = new Shipping();
        System.out.print("Enter first person's name here (Must be capitalized): ");
        String firstName = s.nextLine();
        System.out.print("Enter second person's name here (Also must be capitalized): ");
        String secondName = s.nextLine();
        System.out.print(shipName.shipNameGenerator(firstName, secondName));
    }
}