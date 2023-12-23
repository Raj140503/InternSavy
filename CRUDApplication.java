import java.util.ArrayList;
import java.util.Scanner;

public class CRUDApplication {
    private static ArrayList<String> todoList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    createItem();
                    break;
                case 2:
                    readItems();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    deleteItem();
                    break;
                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n===== To-Do List Application =====");
        System.out.println("1. Add Item");
        System.out.println("2. View Items");
        System.out.println("3. Update Item");
        System.out.println("4. Delete Item");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice() {
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        return choice;
    }

    private static void createItem() {
        System.out.print("Enter the item to add: ");
        String item = scanner.nextLine();
        todoList.add(item);
        System.out.println("Item added successfully!");
    }

    private static void readItems() {
        System.out.println("\n===== To-Do List =====");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ". " + todoList.get(i));
        }
    }

    private static void updateItem() {
        readItems();
        System.out.print("Enter the number of the item to update: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 
        if (index >= 1 && index <= todoList.size()) {
            System.out.print("Enter the new value: ");
            String newItem = scanner.nextLine();
            todoList.set(index - 1, newItem);
            System.out.println("Item updated successfully!");
        } else {
            System.out.println("Invalid item number.");
        }
    }

    private static void deleteItem() {
        readItems();
        System.out.print("Enter the number of the item to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 
        if (index >= 1 && index <= todoList.size()) {
            todoList.remove(index - 1);
            System.out.println("Item deleted successfully!");
        } else {
            System.out.println("Invalid item number.");
        }
    }
}
