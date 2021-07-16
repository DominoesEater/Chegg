package RealEstate;
import java.util.Scanner;
public class REO {
	 // a method that prints the header of the menu with the given title
    public static void printHeader(String title) {
            System.out.println("\n");
            for (int i = 0; i < 40; i++) {
                    System.out.print("-");
            }
            System.out.println();
            // as we need to print title in center of the header:
            // print (20-(title.length)/2) white spaces
            for (int i = 0; i < 20 - (title.length()) / 2; i++) {
                    System.out.print(" ");
            }
            System.out.println(title);

            for (int i = 0; i < 40; i++) {
                    System.out.print("-");
            }
            System.out.println("\n");
    }

    // method that shows main menu interface and controls its functionality
    public static void mainMenuInterface(Scanner scanner) {
            printHeader("Main Menu");
            // print the menu items
            System.out.println("1: Listings \n2: Bids \n");
            System.out.print("What would you like to do?(1-2): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //digest the extra enter

            switch (choice) {
            case 1:
                    listingMenuInterface(scanner);
                    break;
            case 2:
                    bidsMenuInterface(scanner);
                    break;
            default:
                    // TODO: define what shall be done when invalid option is chosen
                    break;
            }

    }

    // method that shows Listing menu interface and controls its functionality
    public static void listingMenuInterface(Scanner scanner) {
            printHeader("Listing Menu");
            // print the menu items
            System.out.println(
                            "1: Add Listings \n2: Show Listings \n3: Auto Populate Listings (Dev tool) \nENTER: Exit back to previous menu\n");
            System.out.print("What would you like to do?(1-3): ");

            String choice = scanner.nextLine();

            switch (choice) {
            case "1":
                    addListingMenuInterface(scanner);
                    break;
            case "2":
                    // TODO: define what shall be done when option 2 is chosen
                    break;
            case "3":
                    // TODO: define what shall be done when option 3 is chosen
                    break;
            case "": // enter is pressed
                    mainMenuInterface(scanner);
                    break;
            default:
                    // TODO: define what shall be done when invalid option is chosen
                    break;
            }
    }

    // method that shows add Listing menu interface and controls its functionality
    public static void addListingMenuInterface(Scanner scanner) {
            printHeader("Add Listing Menu");
            // print the menu items
            System.out.println("1: Add House \n2: Add Condo \nENTER: Exit back to previous menu\n");
            System.out.print("What would you like to do?(1-2): ");

            String choice = scanner.nextLine();

            switch (choice) {
            case "1":
                    // TODO: define what shall be done when option 2 is chosen
                    break;
            case "2":
                    // TODO: define what shall be done when option 2 is chosen
                    break;
            case "": // enter is pressed
                    listingMenuInterface(scanner);
                    break;
            default:
                    // TODO: define what shall be done when invalid option is chosen
                    break;
            }
    }

    // method that shows bids menu interface and controls its functionality
    public static void bidsMenuInterface(Scanner scanner) {
            printHeader("Bids Menu");
            // print the menu items
            System.out.println(
                            "1: Add New Bid \n2: Show Existing Bids\n3: Auto Populate Bids (Dev tool) \nENTER: Exit back to previous menu\n");
            System.out.print("What would you like to do?(1-3): ");

            String choice = scanner.nextLine();

            switch (choice) {
            case "1":
                    // TODO: define what shall be done when option 1 is chosen
                    break;
            case "2":
                    // TODO: define what shall be done when option 2 is chosen
                    break;
            case "3":
                    // TODO: define what shall be done when option 3 is chosen
                    break;
            case "": // enter is pressed
                    mainMenuInterface(scanner);
                    break;
            default:
                    // TODO: define what shall be done when invalid option is chosen
                    break;
            }

    }

    public static void main(String[] args) {
            // a scanner to take user input
            Scanner scanner = new Scanner(System.in);
            mainMenuInterface(scanner);
            scanner.close();
    }

}


