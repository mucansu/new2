package p2;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Item> items = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static Scanner sc2 = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("");
        do {
            displayMenu();

            int option = getOption();
            if (option == 1) {
                addItem();
            } else if (option == 2) {
                getList();

            } else if (option == 3) {
                getTheLargest();

            } else if (option == 4) {
                getTheCheapest();
            } else if (option == 5) {
                System.out.println("Exiting...");
                break;
            } else System.out.println("Wrong number, please try again\n");
        } while (true);
    }
    public static void displayMenu() {
        System.out.println("\n\t\t\tMENU\n________________________________\n");
        System.out.println("1 - Add item");
        System.out.println("2 - See the shopping list");
        System.out.println("3 - See the most expensive item");
        System.out.println("4 - See the cheapest item");
        System.out.println("5 - Exit");
    }
    static int getOption() {
        System.out.print("\nOption : ");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;

    }
    public static void getTheLargest() {
        System.out.println("Most expensive item : " + items.get(items.size() - 1).name + "\n" + "Its price : " + items.get(items.size() - 1).price);
    }
    public static void getTheCheapest() {
        System.out.println("The cheapest item : " + items.get(0).name + "\n" + "Its price : " + items.get(0).price);
    }
    public static void addItem() {
        System.out.print("Enter an item : ");
        String name = sc.nextLine();

        System.out.print("How much does " + name + " cost ? : ");
        int price = sc2.nextInt();

        items.add(new Item(name, price));
        items.sort(Comparator.comparing(Item::getPrice));
    }
    public static void getList() {
        System.out.println("\t\tSHOPPING LIST : \n____________________________");
        for (Item item : items) {
            System.out.println(item.name + " - " + item.price + " kronor");
        }
    }
}
