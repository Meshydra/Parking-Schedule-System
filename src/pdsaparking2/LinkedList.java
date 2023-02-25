/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdsaparking2;

import static pdsaparking2.main.tempData;

/**
 *
 * @author Meshith
 */

class Node {
    String Name;
    String LicenseNumber;
    String ParkedTime;
    int ParkedSpot;
    Node next;

    Node(String Name, String LicenseNumber, String ParkedTime, int ParkedSpot) {
        
        this.Name = Name;
        this.LicenseNumber = LicenseNumber;
        this.ParkedTime = ParkedTime;
        this.ParkedSpot = ParkedSpot;
        
        this.next = null;
    }
}
public class LinkedList {
    Node head;
    Node tail;

    public void add(String Name, String LicenseNumber, String ParkedTime, int ParkedSpot) {
    Node newNode = new Node(Name, LicenseNumber, ParkedTime, ParkedSpot);

    if (head == null) {
        // If the list is empty, set the head and tail to the new node
        head = newNode;
        tail = newNode;
    } else if (ParkedSpot < head.ParkedSpot) {
        // If the new node's parked spot is less than the head's parked spot, insert the new node at the head
        newNode.next = head;
        head = newNode;
    } else {
        // Traverse the list to find the appropriate position for the new node
        Node current = head;
        while (current.next != null && current.next.ParkedSpot < ParkedSpot) {
            current = current.next;
        }
        // Check if the next parking spot is bigger than the new node's parked spot
        if (current.next == null || current.next.ParkedSpot > ParkedSpot) {
            // Insert the new node after the current node
            newNode.next = current.next;
            current.next = newNode;
            // If the new node is inserted at the end, update the tail
            if (newNode.next == null) {
                tail = newNode;
            }
        } else {
            // If the next parking spot is not bigger, continue to the next node
            add(Name, LicenseNumber, ParkedTime, ParkedSpot);
        }
    }
}
    
    public int availableParkSpot() {
    // Check if the list is empty
    if (tempData.head == null) {
        return 1;
    }
    Node currentNode = tempData.head;
    int number = 1;
    while (currentNode != null) {
        if (currentNode.ParkedSpot == number) {
            // If the current node's parked spot matches the current number, increment the number and move to the next node
            number++;
            currentNode = tempData.head;
        } else if (currentNode.ParkedSpot < number) {
            // If the current node's parked spot is less than the current number, move to the next node
            currentNode = currentNode.next;
        } else {
            // If the current node's parked spot is greater than the current number, return the current number as the available spot
            return number;
        }
    }
    // If all spots are currently in use, return the next available spot
    return number;
}
}
