package linkedlist;

import java.util.Scanner;

public class linkedList_operations {
    static class Node {
        int data;
        Node link;

        Node(int d) {
            data = d;
            link = null;
        }
    }

    static Node start;

    static void addNode(int d) {
        if (start == null) {
            start = new Node(d);
        } else {
            Node temp = new Node(d);
            temp.link = start;
            start = temp;
        }
    }

    static void insert(int data, int pos) {
        Node temp1 = new Node(data);
        if (pos == 1) {
            temp1.link = start;
            start = temp1;
            return;
        }
        Node temp2 = start;
        for (int i = 1; i < pos - 1 && temp2 != null; i++) {
            temp2 = temp2.link;
        }
        if (temp2 == null) {
            System.out.println("Invalid position!");
            return;
        }
        temp1.link = temp2.link;
        temp2.link = temp1;
    }

    static void removeDuplicates(Node start) {
        Node rj = start;
        while (rj != null) {
            while (rj.link != null && rj.data == rj.link.data) {
                rj.link = rj.link.link;
            }
            rj = rj.link;
        }
    }

    static Node reverse(Node start) {
        Node current = start;
        Node prev = null;
        Node next;
        while (current != null) {
            next = current.link;
            current.link = prev;
            prev = current;
            current = next;
        }
        start = prev;
        return start;
    }

    static void reverseLink(Node temp1) {
        if (temp1.link == null) {
            start = temp1;
            return;
        }
        reverseLink(temp1.link);
        Node temp2 = temp1.link;
        temp2.link = temp1;
        temp1.link = null;
    }

    static int deleteNode() {
        if (start == null) {
            System.out.println("\nList is empty");
            return -1;
        }
        int dr = start.data;
        start = start.link;
        return dr;
    }

    static void deleteAtPosition(int pos) {
        Node temp1 = start;
        if (pos == 1) {
            start = temp1.link;
            return;
        }
        for (int i = 0; temp1 != null && i < pos - 2; i++) {
            temp1 = temp1.link;
        }
        if (temp1 == null || temp1.link == null) {
            System.out.println("Invalid position!");
            return;
        }
        Node temp2 = temp1.link;
        temp1.link = temp2.link;
    }

    static void display() {
        Node temp = start;
        System.out.println("\nLinked List ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Linked List Operations: ");
            System.out.println("1. Insert from Beginning");
            System.out.println("2. Insert at Nth Position");
            System.out.println("3. Remove Duplicates");
            System.out.println("4. Reverse Linked List");
            System.out.println("5. Reverse Linked List Using Recursion");
            System.out.println("6. Delete at Beginning");
            System.out.println("7. Delete Node at Nth Position");
            System.out.println("8. Display Linked List");
            System.out.print("Enter Choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("\nNumber of elements to be Inserted: ");
                    int n = scanner.nextInt();
                    System.out.print("Enter Data: ");
                    for (int i = 0; i < n; i++) {
                        int data = scanner.nextInt();
                        addNode(data);
                    }
                    display();
                    break;
                case 2:
                    System.out.print("Enter Position: ");
                    int pos = scanner.nextInt();
                    System.out.print("Enter the Data: ");
                    int data = scanner.nextInt();
                    insert(data, pos);
                    display();
                    break;
                case 3:
                    System.out.println("\nRemove Duplicates");
                    removeDuplicates(start);
                    display();
                    break;
                case 4:
                    start = reverse(start);
                    System.out.println("\nReversed: ");
                    display();
                    break;
                case 5:
                    System.out.println("Recursion Reverse");
                    reverseLink(start);
                    display();
                    break;
                case 6:
                    System.out.println(deleteNode());
                    break;
                case 7:
                    System.out.print("Enter Position for deletion: ");
                    int position = scanner.nextInt();
                    deleteAtPosition(position);
                    display();
                    break;
                case 8:
                    display();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("\nDo you want to continue [y/n]: ");
            ch = scanner.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
        
        
        scanner.close();
       
    }
}