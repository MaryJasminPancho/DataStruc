import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List 
{
   static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null; // Head of the linked list
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Main method to run the application
        int choice;

        do {
            displayMenu(); // Display the menu options
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Get user's choice
            scanner.nextLine(); // Consume the newline character after reading the integer

            switch (choice) {
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                case 1:
                    insertAtBeginning(); // Insert at the beginning of the list
                    break;
                case 2:
                    deleteAtBeginning(); // Delete from the beginning of the list
                    break;
                case 3:
                    displayList(); // Display all elements in the list
                    break;
                case 4:
                    searchElement(); // Search for an element in the list
                    break;
                case 5:
                    deleteElementByKey(); // Delete a node by its key
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(); // Add a newline for better readability
        } while (choice != 0); // Continue until the user chooses to exit

        scanner.close(); // Close the scanner to prevent resource leaks
    }

    // Method to display the menu options
    static void displayMenu() {
        System.out.println("[0] Terminate the Program");
        System.out.println("[1] Insert an Element (Beginning)");
        System.out.println("[2] Delete an Element (Beginning)");
        System.out.println("[3] Display All Elements");
        System.out.println("[4] Search an Element");
        System.out.println("[5] Delete an Element by Key");
    }

    // Method to insert a new node at the beginning of the linked list
    static void insertAtBeginning() {
        System.out.print("Enter the element to insert: ");
        int data = scanner.nextInt(); // Get the data for the new node
        scanner.nextLine(); // consume the extra newline
        Node newNode = new Node(data); // Create a new node with the given data

        if (head == null) {
            head = newNode; // If the list is empty, the new node becomes the head
        } else {
            newNode.next = head; // Otherwise, insert the new node before the current head
            head = newNode; // and update the head to point to the new node
        }
        System.out.println(data + " inserted at the beginning.");
    }

    // Method to delete a node from the beginning of the linked list
    static void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
        } else {
            int deletedData = head.data; // Store the data of the node to be deleted
            head = head.next; // Update the head to point to the next node
            System.out.println(deletedData + " deleted from the beginning.");
        }
    }

    // Method to display all the elements in the linked list
    static void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Elements in the list: ");
        Node current = head; // Start from the head of the list
        while (current != null) {
            System.out.print(current.data + " "); // Print the data of the current node
            current = current.next; // Move to the next node
        }
        System.out.println();
    }

    // Method to search for an element in the linked list
    static void searchElement() {
        if (head == null) {
            System.out.println("List is empty. Cannot search.");
            return;
        }
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Node current = head; // Start from the head
        int position = 1; // Keep track of the position of the element
        while (current != null) {
            if (current.data == key) {
                System.out.println(key + " found at position " + position + ".");
                return; // Exit the method if the element is found
            }
            current = current.next; // Move to the next node
            position++;
        }
        System.out.println(key + " not found in the list."); // This line is reached if the element is not found
    }

    // Method to delete an element with a given key from the linked list
    static void deleteElementByKey() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        System.out.print("Enter the element to delete: ");
        int key = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (head.data == key) {
            head = head.next; // If the key is at the head, update the head
            System.out.println(key + " deleted from the list.");
            return;
        }

        Node current = head;
        Node previous = null; // Keep track of the previous node
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println(key + " not found in the list.");
        } else {
            previous.next = current.next; // Remove the node by updating the previous node's next pointer
            System.out.println(key + " deleted from the list.");
        }
    }
}

